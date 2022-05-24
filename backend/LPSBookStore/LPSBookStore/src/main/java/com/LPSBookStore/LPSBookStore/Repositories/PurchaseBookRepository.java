package com.LPSBookStore.LPSBookStore.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.LPSBookStore.LPSBookStore.Entities.Book;
import com.LPSBookStore.LPSBookStore.Entities.FavoriteBooks;
import com.LPSBookStore.LPSBookStore.Entities.Purchase;
import com.LPSBookStore.LPSBookStore.Entities.PurchaseBook;

public interface PurchaseBookRepository extends JpaRepository<PurchaseBook, Integer> {

	@Query(value = "SELECT pb.* FROM Purchase_Book pb join Purchase p on pb.purchase_id = p.id where p.client_id = :client  ", nativeQuery = true)
	List<PurchaseBook> getClientPurchase(@Param("client") int client);
}
