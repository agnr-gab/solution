package br.com.viaHub.postoDeGasolina;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequisicaoAbastecimento {
    private List<Carro> carros;
    private int quantidadeBombas;
}
