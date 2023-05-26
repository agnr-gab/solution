package br.com.viaHub.carrinhoDeCompras.application.controller;

import br.com.viaHub.carrinhoDeCompras.application.entity.Produto;
import br.com.viaHub.carrinhoDeCompras.application.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/") //ALTERAR URL DEIXAR APENAS API
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    //@RequestMapping ("produtos") TODOS OS OUTRSO VERBOS
    public List<Produto> listarTodosProdutos() {
        Produto produto = new Produto();
        produto.setNome("Máquina");
        produto.setVendido(true);
        produtoRepository.save(produto);

        return produtoRepository.findAll();
    }

//    @PostMapping("/produtos")
//    public Produto addProduto(@RequestBody Produto produto) {
//        return produtoRepository.save(produto);
//    }

//    @PutMapping("/{id}")
//    public Produto atualizarStatusProduto(@PathVariable Long id, @RequestBody Produto produtoAtualizado) {
//        Produto produto = produtoRepository.findById(id).orElseThrow(() ->
//                new RuntimeException("Id informado não localizado para o produto " + id));
//
//        produto.setVendido(produtoAtualizado.isVendido());
//        return produtoRepository.save(produto);
//
//    }
}
