package br.com.viaHub.carrinhoDeCompras.application.controller;

import br.com.viaHub.carrinhoDeCompras.application.entity.Produto;
import br.com.viaHub.carrinhoDeCompras.application.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produtos")
    public List<Produto> listarTodosProdutos() {
        Produto produto = new Produto();
        produto.setNome("Máquina");
        produto.setVendido(true);
        produtoService.criarProduto(produto);

        return produtoService.listarTodosProdutos();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id) {
        return produtoService.buscarProdutoPorId(id);
    }

    @GetMapping("/vendidos")
    public List<Produto> obterProdutosVendidos() {
        return produtoService.obterProdutosPorStatus(true);
    }

    @GetMapping("/naovendidos")
    public List<Produto> obterProdutosNaoVendidos() {
        return produtoService.obterProdutosPorStatus(false);
    }

    @PostMapping("/produtos")
    public Produto addProduto(@RequestBody Produto produto) {
        return produtoService.criarProduto(produto);
    }

    @PutMapping("/{id}")
    public void atualizarStatusProduto(@PathVariable Long id, @RequestBody Produto produto) {
        Produto produtoExistente = produtoService.buscarProdutoPorId(id);
        if (produtoExistente != null) {
            produtoExistente.setVendido(produto.isVendido());
            produtoService.atualizarProduto(produtoExistente);
        }
    }
}
