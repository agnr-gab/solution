package br.com.viaHub.carrinhoDeCompras.application.service;

import br.com.viaHub.carrinhoDeCompras.application.entity.Produto;
import br.com.viaHub.carrinhoDeCompras.application.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;

    }

    public List<Produto> listarTodosProdutos() {
        return produtoRepository.findAll();
    }

    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Id informado não localizado para o produto " + id));
    }

    public List<Produto> obterProdutosPorStatus(boolean vendido) {
        return produtoRepository.findByVendido(vendido);
    }

    public void atualizarProduto(Produto produto) {
        produtoRepository.save(produto);
    }

}
