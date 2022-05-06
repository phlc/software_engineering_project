package com.LPSBookStore.LPSBookStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.LPSBookStore.LPSBookStore.Entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
