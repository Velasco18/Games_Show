package com.lojaDeGames.GamesShow.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaDeGames.GamesShow.Model.Produto;

public interface ProdutoRespository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	

}
