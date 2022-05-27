package com.LPSBookStore.LPSBookStore.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.LPSBookStore.LPSBookStore.Entities.FavoriteBooks;

public interface FavoriteBooksRepository extends JpaRepository<FavoriteBooks, Integer> {
	@Query(value = "SELECT * FROM Favorite_Books u WHERE u.client_id = :client", nativeQuery = true)
	List<FavoriteBooks> getFavoritesByUser(@Param("client") int client);
	
	@Query(value = "SELECT * FROM Favorite_Books u WHERE u.client_id = :client and u.book_id = :book", nativeQuery = true)
	List<FavoriteBooks> getFavoritesByUserAndBook(@Param("client") int client, @Param("book") int book);
}
