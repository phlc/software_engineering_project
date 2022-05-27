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
		
		// Terror
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51z0s3GcvwL._SX346_BO1,204,203,200_.jpg", 10.0, "It: A coisa", "Stephen King", "Durante as férias de 1958, em uma pacata cidadezinha chamada Derry, um grupo de sete amigos começa a ver coisas estranhas. Um conta que viu um palhaço, outro que viu uma múmia. Finalmente, acabam descobrindo que estavam todos vendo a mesma coisa: um ser sobrenatural e maligno que pode assumir várias formas. É assim que Bill, Beverly, Eddie, Ben, Richie, Mike e Stan enfrentam a Coisa pela primeira vez.",
				48.24, 10, "Terror", dateFormat.parse("1986-09-15"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/61dOYnvCQ2L._SX346_BO1,204,203,200_.jpg", 10.0, "Outsider", "Stephen King", "O corpo de um menino de onze anos é encontrado abandonado no parque de Flint City, brutalmente assassinado. Testemunhas e impressões digitais apontam o criminoso como uma das figuras mais conhecidas da cidade ― Terry Maitland, treinador da Liga Infantil de beisebol, professor de inglês, casado e pai de duas filhas.",
				23.14, 1, "Terror", dateFormat.parse("2018-06-15"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51ta+h8MlCL._SX345_BO1,204,203,200_.jpg", 10.0, "Dracul: A origem de um monstro", "Dacre Stoker", "O manuscrito original de Drácula, um dos maiores clássicos de horror da literatura mundial, tinha mais páginas que a versão que viria a ser publicada. Considerado “sombrio e assustador demais” para os leitores da época, um trecho foi suprimido, contra a vontade do autor. Essa primeira parte do livro nunca foi divulgada e, ao longo dos anos, apenas alguns poucos leitores selecionados tiveram acesso a ela.",
				31.30, 1, "Terror", dateFormat.parse("2018-09-20"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41JYo9IEyiL._SX339_BO1,204,203,200_.jpg", 10.0, "Histórias de horror e mistério", "Dacre Stoker", "DO CRIADOR DO ICÔNICO SHERLOCK HOLMES.Arthur Conan Doyle é a mente por trás de personagens icônicos da literatura. É sinônimo de histórias de detetive. É dono de seu próprio estilo, impresso no imaginário do leitor. Mas e se, mesmo depois de dois séculos, pudéssemos redescobrir esse grande clássico com outras facetas?“Histórias de horror e mistério” é uma coletânea de 12 contos curtos e de leitura hipnotizante, graças à escrita de Doyle. ",
				26.99, 5, "Terror", dateFormat.parse("2019-07-15"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41zFpTcV86L._SX345_BO1,204,203,200_.jpg", 10.0, "Psicose", "Robert Bloch", "Psicose, o clássico de Robert Bloch, foi publicado originalmente em 1959, livremente inspirado no caso do assassino de Wisconsin, Ed Gein. O protagonista Norman Bates, assim como Gein, era um assassino solitário que vivia em uma localidade rural isolada, teve uma mãe dominadora, construiu um santuário para ela em um quarto e se vestia com roupas femininas.",
				40.90, 0, "Terror", dateFormat.parse("2013-07-01"), true));
		
		//Autoajuda
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51Xby92J9KL._SX346_BO1,204,203,200_.jpg", 10.0, "O poder do hábito", "Charles Duhigg", "O que todas essas pessoas tem em comum? Conseguiram ter sucesso focando em padrões que moldam cada aspecto de nossas vidas. Tiveram êxito transformando hábitos. Com perspicácia e habilidade, Charles Duhigg apresenta um novo entendimento da natureza humana e seu potencial para a transformação.",
				12.90, 10, "Autoajuda", dateFormat.parse("2012-09-24"), true));
		
		books.add(new Book("https://m.media-amazon.com/images/I/41+7a4RuENL.jpg", 10.0, "Mindset: A nova psicologia do sucesso", "Carol Dweck", "Carol S. Dweck, professora de psicologia na Universidade Stanford e especialista internacional em sucesso e motivação, desenvolveu, ao longo de décadas de pesquisa, um conceito fundamental: a atitude mental com que encaramos a vida, que ela chama de \"mindset\", é crucial para o sucesso. Dweck revela de forma brilhante como o sucesso pode ser alcançado pela maneira como lidamos com nossos objetivos.",
				26.19, 5, "Autoajuda", dateFormat.parse("2014-01-24"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51ilQPPPanL._SX339_BO1,204,203,200_.jpg", 10.0, "Mindset: A nova psicologia do sucesso", "Paulo Vieira", "Acorde para os objetivos que quer conquistar. Já aconteceu a você de se olhar no espelho e não gostar daqueles quilos a mais? De observar seu momento profissional somente com frustração? De se sentir desconectado dos seus familiares, dos seus amigos? Se você acha que essas são situações normais, pense de novo! Só porque isso acontece com várias pessoas não quer dizer que a vida deva ser assim. Só porque algo se torna comum, não significa que seja normal! ",
				19.99, 5, "Autoajuda", dateFormat.parse("2015-06-01"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41tRkQbNWQL._SX331_BO1,204,203,200_.jpg", 10.0, "Em busca de nós mesmos", "Clóvis de Barros Filho e Pedro Calabrez", "Perguntas manjadas, é verdade. Mas quem nunca pensou nisso pelo menos uma vez na vida? O questionamento sobre nossa existência, origem e destino tem sido tema de profunda reflexão dos maiores pensadores da humanidade ao longo de três mil anos e, mais recentemente, dos cientistas. As perguntas são as mesmas desde que o homem começou a pensar. As respostas não. Muito pelo contrário.",
				9.99, 5, "Autoajuda", dateFormat.parse("2017-07-31"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/71cCAucztCL.jpg", 10.0, "Em busca de nós mesmos", "Beth Evans", "A vida adulta não é fácil. E quem nunca fuxicou as redes sociais de amigos bem-sucedidos, só para se comparar, e acabou se sentindo pior ainda, que atire a primeira pedra.",
				10.95, 5, "Autoajuda", dateFormat.parse("2019-08-31"), true));
		
		return books;
	}
    
}
