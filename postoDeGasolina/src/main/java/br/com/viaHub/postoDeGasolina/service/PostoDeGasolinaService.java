package br.com.viaHub.postoDeGasolina.service;

import br.com.viaHub.postoDeGasolina.Carro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class PostoDeGasolinaService {

    public List<Carro> abastecerCarros(Carro[] carros, int quantidadeBombas) {
        List<Carro> carrosOrdenadosPorTempo = new ArrayList<>();

        for (Carro carro : carros) {
            carrosOrdenadosPorTempo.add(carro);
        }
        carrosOrdenadosPorTempo.sort(Comparator.comparingInt(Carro::getTempoAbastecimento));

        List<Carro> carrosAtendidos = new ArrayList<>();

        List<Carro> ordemSaidaCarros = new ArrayList<>();

        for (Carro carro : carrosOrdenadosPorTempo) {
            while (carrosAtendidos.size() >= quantidadeBombas) {
                esperar();
                verificarCarrosAtendidos(carrosAtendidos, ordemSaidaCarros);
            }
            carrosAtendidos.add(carro);
        }

        while (!carrosAtendidos.isEmpty()) {
            esperar();
            verificarCarrosAtendidos(carrosAtendidos, ordemSaidaCarros);
        }

        return ordemSaidaCarros;
    }

    private void esperar() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void verificarCarrosAtendidos(List<Carro> carrosAtendidos, List<Carro> ordemSaidaCarros) {
        carrosAtendidos.removeIf(carro -> {
            if (carro.getTempoAbastecimento() > 0) {
                carro.setTempoAbastecimento(carro.getTempoAbastecimento() - 1);
                return false;
            } else {
                ordemSaidaCarros.add(carro);
                return true;
            }
        });
    }
}
