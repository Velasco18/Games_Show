package com.lojaDeGames.GamesShow.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaDeGames.GamesShow.Model.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{
	//criando metodos para Querys (Pesquisas)
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
	

}
