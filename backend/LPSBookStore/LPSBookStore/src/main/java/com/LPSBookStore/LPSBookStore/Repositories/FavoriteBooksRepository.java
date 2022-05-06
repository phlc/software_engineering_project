package com.LPSBookStore.LPSBookStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LPSBookStore.LPSBookStore.Entities.FavoriteBooks;

public interface FavoriteBooksRepository extends JpaRepository<FavoriteBooks, Integer> {

}
