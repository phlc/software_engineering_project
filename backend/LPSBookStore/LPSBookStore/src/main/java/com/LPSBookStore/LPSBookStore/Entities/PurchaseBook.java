package com.LPSBookStore.LPSBookStore.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PURCHASE_BOOK")
public class PurchaseBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pb;
	@ManyToOne
	@JoinColumn(name = "purchase_id") 
    private Purchase purchase;
	@ManyToOne
	@JoinColumn(name = "book_id") 
    private Book book;
	public Integer getId() {
		return id_pb;
	}
	public void setId(Integer id) {
		this.id_pb = id;
	}
	public Purchase getPurchase() {
		return purchase;
	}
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	
}
