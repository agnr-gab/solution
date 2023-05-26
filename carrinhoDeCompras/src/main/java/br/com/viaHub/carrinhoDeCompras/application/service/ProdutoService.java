package br.com.viaHub.carrinhoDeCompras.application.service;

import br.com.viaHub.carrinhoDeCompras.application.entity.Produto;
import br.com.viaHub.carrinhoDeCompras.application.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;

    }

    public List<Produto> getAllPrdutcs() {
        return produtoRepository.findAll();
    }

    public Produto createProduct(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

}
