package com.LPSBookStore.LPSBookStore.Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;    
	private String coverURL;
    private Double rate;
    private String title;
    private String author;
	@Column(columnDefinition="TEXT")
    private String description;
    private Double price;
    private Integer stock;
    private String category;
    private Date releaseDate;
    private boolean isRelease;
    
    public Book() {
    	
    }
    
    public Book(String coverURL, Double rate, String title, String author, String description, Double price,
			Integer stock, String category, Date releaseDate, boolean isRelease) {
		super();
		this.coverURL = coverURL;
		this.rate = rate;
		this.title = title;
		this.author = author;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.category = category;
		this.releaseDate = releaseDate;
		this.isRelease = isRelease;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCoverURL() {
		return coverURL;
	}

	public void setCoverURL(String coverURL) {
		this.coverURL = coverURL;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isRelease() {
		return isRelease;
	}

	public void setRelease(boolean isRelease) {
		this.isRelease = isRelease;
	}
	
	public static ArrayList<Book> getInitBooks() throws ParseException{
		ArrayList<Book> books = new ArrayList<Book>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51z0s3GcvwL._SX346_BO1,204,203,200_.jpg", 10.0, "It: A coisa", "Stephen King", "Durante as férias de 1958, em uma pacata cidadezinha chamada Derry, um grupo de sete amigos começa a ver coisas estranhas. Um conta que viu um palhaço, outro que viu uma múmia. Finalmente, acabam descobrindo que estavam todos vendo a mesma coisa: um ser sobrenatural e maligno que pode assumir várias formas. É assim que Bill, Beverly, Eddie, Ben, Richie, Mike e Stan enfrentam a Coisa pela primeira vez.",
				48.24, 10, "Terror", dateFormat.parse("1986-09-15"), false));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/61dOYnvCQ2L._SX346_BO1,204,203,200_.jpg", 10.0, "Outsider", "Stephen King", "O corpo de um menino de onze anos é encontrado abandonado no parque de Flint City, brutalmente assassinado. Testemunhas e impressões digitais apontam o criminoso como uma das figuras mais conhecidas da cidade ― Terry Maitland, treinador da Liga Infantil de beisebol, professor de inglês, casado e pai de duas filhas.",
				23.14, 1, "Terror", dateFormat.parse("2018-06-15"), false));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51ta+h8MlCL._SX345_BO1,204,203,200_.jpg", 10.0, "Dracul: A origem de um monstro", "Dacre Stoker", "O manuscrito original de Drácula, um dos maiores clássicos de horror da literatura mundial, tinha mais páginas que a versão que viria a ser publicada. Considerado “sombrio e assustador demais” para os leitores da época, um trecho foi suprimido, contra a vontade do autor. Essa primeira parte do livro nunca foi divulgada e, ao longo dos anos, apenas alguns poucos leitores selecionados tiveram acesso a ela.",
				31.30, 1, "Terror", dateFormat.parse("2018-09-20"), false));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41JYo9IEyiL._SX339_BO1,204,203,200_.jpg", 10.0, "Histórias de horror e mistério", "Dacre Stoker", "DO CRIADOR DO ICÔNICO SHERLOCK HOLMES.Arthur Conan Doyle é a mente por trás de personagens icônicos da literatura. É sinônimo de histórias de detetive. É dono de seu próprio estilo, impresso no imaginário do leitor. Mas e se, mesmo depois de dois séculos, pudéssemos redescobrir esse grande clássico com outras facetas?“Histórias de horror e mistério” é uma coletânea de 12 contos curtos e de leitura hipnotizante, graças à escrita de Doyle. ",
				26.99, 5, "Terror", dateFormat.parse("2019-07-15"), false));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41zFpTcV86L._SX345_BO1,204,203,200_.jpg", 10.0, "Psicose", "Robert Bloch", "Psicose, o clássico de Robert Bloch, foi publicado originalmente em 1959, livremente inspirado no caso do assassino de Wisconsin, Ed Gein. O protagonista Norman Bates, assim como Gein, era um assassino solitário que vivia em uma localidade rural isolada, teve uma mãe dominadora, construiu um santuário para ela em um quarto e se vestia com roupas femininas.",
				40.90, 0, "Terror", dateFormat.parse("2013-07-01"), false));
		
		return books;
	}
    
}
