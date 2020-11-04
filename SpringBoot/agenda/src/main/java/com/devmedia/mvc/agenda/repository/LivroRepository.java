package com.devmedia.mvc.agenda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devmedia.mvc.agenda.entity.LivroEntity;

public interface LivroRepository extends JpaRepository<LivroEntity, Long>{

	//Encontra todos os livros de um mesmo autor
	//@param autor
	//@return lista de livros
	List<LivroEntity> findByAutor(String autor);
	
	
//	Encontra um livro a partir do seu titulo
//	Retorna uma lista pois podem existir mais de um livro com o mesmo titulo
//	@param titulo
//	@return lista de livros
	List<LivroEntity> findByTitulo(String titulo);
	
	
//	Encontra um livro a partir de seu isbn, como o isbn único, apenas um livro pode ser encontrado
	LivroEntity findByIsbn(String isbn);
	
	
}
