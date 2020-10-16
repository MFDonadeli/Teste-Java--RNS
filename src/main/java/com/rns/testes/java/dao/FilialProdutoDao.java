package com.rns.testes.java.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rns.testes.java.model.FilialProduto;

public interface FilialProdutoDao extends JpaRepository<FilialProduto, Long> {


}