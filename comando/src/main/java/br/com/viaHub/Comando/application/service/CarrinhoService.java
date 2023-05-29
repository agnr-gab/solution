package br.com.viaHub.Comando.application.service;

import br.com.viaHub.Comando.application.client.CarrinhoClient;
import br.com.viaHub.Comando.application.model.ProdutoClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {

    private final CarrinhoClient feingClient;

    public CarrinhoService(CarrinhoClient feingClient) {
        this.feingClient = feingClient;
    }

    public List<ProdutoClient> listaProdutos() {
        return feingClient.getProdutos();
    }

    public List<ProdutoClient> obterProdutosPorStatus(boolean vendido) {
        return feingClient.obterProdutosVendidos();
    }
}
