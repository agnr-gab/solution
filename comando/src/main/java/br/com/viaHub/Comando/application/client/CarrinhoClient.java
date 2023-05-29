package br.com.viaHub.Comando.application.client;

import br.com.viaHub.Comando.application.model.ProdutoClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "produtos", url = "http://localhost:8081/")
public interface CarrinhoClient {

    @GetMapping("/produtos")
    List<ProdutoClient> getProdutos();

    @GetMapping("/vendidos")
    List<ProdutoClient> obterProdutosVendidos();

}
