package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;


@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	/*SELECT * FROM tb_postagem where titulo like "%titulo%";*/
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

}