package br.com.viaHub.postoDeGasolina.controller;

import br.com.viaHub.postoDeGasolina.Carro;
import br.com.viaHub.postoDeGasolina.RequisicaoAbastecimento;
import br.com.viaHub.postoDeGasolina.service.PostoDeGasolinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posto")
public class PostoDeGasolinaController {

    private final PostoDeGasolinaService postoDeGasolinaService;

    @Autowired
    public PostoDeGasolinaController(PostoDeGasolinaService postoDeGasolinaService) {
        this.postoDeGasolinaService = postoDeGasolinaService;
    }

    @PostMapping("/abastecer")
    public List<Carro> abastecerCarros(@RequestBody Carro[] carros, @RequestParam int quantidadeBombas) {
        return postoDeGasolinaService.abastecerCarros(carros, quantidadeBombas);
    }

    public List<Carro> abastecerCarros(@RequestBody RequisicaoAbastecimento requisicao) {
        List<Carro> carros = requisicao.getCarros();
        int quantidadeBombas = requisicao.getQuantidadeBombas();

        return postoDeGasolinaService.abastecerCarros(carros.toArray(new Carro[0]), quantidadeBombas);
    }

}
