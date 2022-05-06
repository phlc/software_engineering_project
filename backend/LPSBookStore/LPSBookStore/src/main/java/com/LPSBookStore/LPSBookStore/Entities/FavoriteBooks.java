package com.LPSBookStore.LPSBookStore.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "FAVORITE_BOOK")
public class FavoriteBooks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;  
	
	@ManyToOne
	@JoinColumn(name = "client_id") 
    private Client client;
	
	@ManyToOne
	@JoinColumn(name = "book_id") 
    private Book book;
}
