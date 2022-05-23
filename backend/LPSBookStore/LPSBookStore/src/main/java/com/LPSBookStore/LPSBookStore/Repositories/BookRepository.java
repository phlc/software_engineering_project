package com.LPSBookStore.LPSBookStore.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.LPSBookStore.LPSBookStore.Entities.Book;
import com.LPSBookStore.LPSBookStore.Entities.FavoriteBooks;

public interface BookRepository extends JpaRepository<Book, Integer> {
	@Query(value = "SELECT * FROM Book u WHERE u.title like %:title%", nativeQuery = true)
	List<Book> getByTitle(@Param("title") String title);
	
	@Query(value = "SELECT * FROM Book u WHERE u.category like %:category%", nativeQuery = true)
	List<Book> getByCategory(@Param("category") String title);
	
	@Query(value = "SELECT * FROM Book u WHERE u.author like %:author%", nativeQuery = true)
	List<Book> getByAuthor(@Param("author") String author);
}
