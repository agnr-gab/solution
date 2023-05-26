package br.com.viaHub.carrinhoDeCompras.application.repository;

import br.com.viaHub.carrinhoDeCompras.application.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {



}
