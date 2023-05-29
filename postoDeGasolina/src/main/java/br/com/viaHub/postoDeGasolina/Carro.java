package br.com.viaHub.postoDeGasolina;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
    private String nome;
    private int tempoAbastecimento;
}
