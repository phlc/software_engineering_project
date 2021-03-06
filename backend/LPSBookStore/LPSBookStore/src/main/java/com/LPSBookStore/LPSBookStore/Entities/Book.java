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
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51z0s3GcvwL._SX346_BO1,204,203,200_.jpg", 10.0, "It: A coisa", "Stephen King", "Durante as f??rias de 1958, em uma pacata cidadezinha chamada Derry, um grupo de sete amigos come??a a ver coisas estranhas. Um conta que viu um palha??o, outro que viu uma m??mia. Finalmente, acabam descobrindo que estavam todos vendo a mesma coisa: um ser sobrenatural e maligno que pode assumir v??rias formas. ?? assim que Bill, Beverly, Eddie, Ben, Richie, Mike e Stan enfrentam a Coisa pela primeira vez.",
				48.24, 10, "Terror", dateFormat.parse("1986-09-15"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/61dOYnvCQ2L._SX346_BO1,204,203,200_.jpg", 10.0, "Outsider", "Stephen King", "O corpo de um menino de onze anos ?? encontrado abandonado no parque de Flint City, brutalmente assassinado. Testemunhas e impress??es digitais apontam o criminoso como uma das figuras mais conhecidas da cidade ??? Terry Maitland, treinador da Liga Infantil de beisebol, professor de ingl??s, casado e pai de duas filhas.",
				23.14, 1, "Terror", dateFormat.parse("2018-06-15"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51ta+h8MlCL._SX345_BO1,204,203,200_.jpg", 10.0, "Dracul: A origem de um monstro", "Dacre Stoker", "O manuscrito original de Dr??cula, um dos maiores cl??ssicos de horror da literatura mundial, tinha mais p??ginas que a vers??o que viria a ser publicada. Considerado ???sombrio e assustador demais??? para os leitores da ??poca, um trecho foi suprimido, contra a vontade do autor. Essa primeira parte do livro nunca foi divulgada e, ao longo dos anos, apenas alguns poucos leitores selecionados tiveram acesso a ela.",
				31.30, 1, "Terror", dateFormat.parse("2018-09-20"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41JYo9IEyiL._SX339_BO1,204,203,200_.jpg", 10.0, "Hist??rias de horror e mist??rio", "Dacre Stoker", "DO CRIADOR DO IC??NICO SHERLOCK HOLMES.Arthur Conan Doyle ?? a mente por tr??s de personagens ic??nicos da literatura. ?? sin??nimo de hist??rias de detetive. ?? dono de seu pr??prio estilo, impresso no imagin??rio do leitor. Mas e se, mesmo depois de dois s??culos, pud??ssemos redescobrir esse grande cl??ssico com outras facetas????Hist??rias de horror e mist??rio??? ?? uma colet??nea de 12 contos curtos e de leitura hipnotizante, gra??as ?? escrita de Doyle. ",
				26.99, 5, "Terror", dateFormat.parse("2019-07-15"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41zFpTcV86L._SX345_BO1,204,203,200_.jpg", 10.0, "Psicose", "Robert Bloch", "Psicose, o cl??ssico de Robert Bloch, foi publicado originalmente em 1959, livremente inspirado no caso do assassino de Wisconsin, Ed Gein. O protagonista Norman Bates, assim como Gein, era um assassino solit??rio que vivia em uma localidade rural isolada, teve uma m??e dominadora, construiu um santu??rio para ela em um quarto e se vestia com roupas femininas.",
				40.90, 0, "Terror", dateFormat.parse("2013-07-01"), true));
		
		//Autoajuda
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/71cCAucztCL.jpg", 10.0, "Em busca de n??s mesmos", "Beth Evans", "A vida adulta n??o ?? f??cil. E quem nunca fuxicou as redes sociais de amigos bem-sucedidos, s?? para se comparar, e acabou se sentindo pior ainda, que atire a primeira pedra.",
				10.95, 5, "Autoajuda", dateFormat.parse("2019-08-31"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51Xby92J9KL._SX346_BO1,204,203,200_.jpg", 10.0, "O poder do h??bito", "Charles Duhigg", "O que todas essas pessoas tem em comum? Conseguiram ter sucesso focando em padr??es que moldam cada aspecto de nossas vidas. Tiveram ??xito transformando h??bitos. Com perspic??cia e habilidade, Charles Duhigg apresenta um novo entendimento da natureza humana e seu potencial para a transforma????o.",
				12.90, 10, "Autoajuda", dateFormat.parse("2012-09-24"), true));
		
		books.add(new Book("https://m.media-amazon.com/images/I/41+7a4RuENL.jpg", 10.0, "Mindset: A nova psicologia do sucesso", "Carol Dweck", "Carol S. Dweck, professora de psicologia na Universidade Stanford e especialista internacional em sucesso e motiva????o, desenvolveu, ao longo de d??cadas de pesquisa, um conceito fundamental: a atitude mental com que encaramos a vida, que ela chama de \"mindset\", ?? crucial para o sucesso. Dweck revela de forma brilhante como o sucesso pode ser alcan??ado pela maneira como lidamos com nossos objetivos.",
				26.19, 5, "Autoajuda", dateFormat.parse("2014-01-24"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51ilQPPPanL._SX339_BO1,204,203,200_.jpg", 10.0, "Mindset: A nova psicologia do sucesso", "Paulo Vieira", "Acorde para os objetivos que quer conquistar. J?? aconteceu a voc?? de se olhar no espelho e n??o gostar daqueles quilos a mais? De observar seu momento profissional somente com frustra????o? De se sentir desconectado dos seus familiares, dos seus amigos? Se voc?? acha que essas s??o situa????es normais, pense de novo! S?? porque isso acontece com v??rias pessoas n??o quer dizer que a vida deva ser assim. S?? porque algo se torna comum, n??o significa que seja normal! ",
				19.99, 5, "Autoajuda", dateFormat.parse("2015-06-01"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/6175IU0qFgL.jpg", 10.0, "A Sutil Arte de Ligar o F*da-Se: Uma Estrat??gia Inusitada Para Uma Vida Melhor", "Mark Manson", "Coaching, autoajuda, desenvolvimento pessoal, mentaliza????o positiva - sem querer desprezar o valor de nada disso, a grande verdade ?? que ??s vezes nos sentimos quase sufocados diante da press??o infinita por parecermos otimistas o tempo todo. ?? um pecado social se deixar abater quando as coisas n??o v??o bem. Ningu??m pode fracassar simplesmente, sem aprender nada com isso. N??o d?? mais. ?? insuport??vel. E ?? a?? que entra a revolucion??ria e sutil arte de ligar o foda-se.",
				99.95, 5, "Autoajuda", dateFormat.parse("2017-10-06"), true));
		//Poesia
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/61CA3Q4FNRL._SX331_BO1,204,203,200_.jpg", 
				10.0, 
				"O livro dos ressignificados", 
				"Akapoeta", 
				"Releituras po??ticas em que experi??ncias pessoais com substantivos, adjetivos e verbos pesam mais do que a objetividade dos dicion??rios. Antes aprisionadas na formalidade dos dicion??rios, palavras como ???girassol???, ???Deus???, ???sonho???, ???tatuagem???, ???cafun????? e muitas outras s??o libertadas por Jo??o Doederlein ??? que assina com o pseud??nimo Akapoeta ??? neste seu primeiro livro. Elas s??o repensadas a partir das experi??ncias pessoais do autor, de vinte anos, e de sua gera????o, mesclando romantismo bem resolvido, paix??o, isolamento e um dia a dia que respira tecnologia e cultura pop.",
				30.99, 5, "Poesia", dateFormat.parse("2022-08-28"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/61hvOHFthkL._SX373_BO1,204,203,200_.jpg", 
				10.0, 
				"De amor tenho vivido: 50 poemas", 
				"Hilda Hilst", 
				"Nesta breve colet??nea, ilustrada pela artista Ana Prata, o leitor vai conhecer as muitas faces da poeta que se dedicou ao amor com total devo????o. Do primeiro livro de poesia, Press??gio, de 1950, at?? o ??ltimo, Cantares do sem nome e de partidas, de 1995, o amor atravessa toda a produ????o po??tica de Hilda Hilst. Em constante di??logo com a tradi????o de odes, trovas e cantares, os poemas tematizam o amor em suas m??ltiplas formas: a entrega ao amado, o desejo ardente, a expectativa pelo encontro, o medo da despedida.",
				40.99, 4, "Poesia", dateFormat.parse("2018-06-01"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41+YyEDgNjL._SY331_BO1,204,203,200_.jpg", 
				10.0, 
				"Box Obra po??tica de Fernando Pessoa", 
				"Fernando Pessoa", 
				"A vasta produ????o de Fernando Pessoa, um dos mais c??lebres poetas em l??ngua portuguesa, ganha uma nova edi????o pela Nova Fronteira, dividida em dois volumes contidos em boxe de luxo. A obra contempla os poemas escritos por Pessoa como ele mesmo e como outros poetas que criou, seus famosos heter??nimos Alberto Caeiro, Ricardo Reis e ??lvaro de Campos, al??m da produ????o po??tica do autor em l??ngua estrangeira e de algumas de suas tradu????es.",
				75.99, 15, "Poesia", dateFormat.parse("2021-10-31"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/21rlFX39SNL._SX363_BO1,204,203,200_.jpg", 
				10.0, 
				"Coisas que guardei pra mim", 
				"Samara A. Buchweitz", 
				"Coisas que guardei para mim conduz o leitor ?? reflex??o sobre tudo aquilo que costumamos guardar para n??s mesmos sem externarmos: o nosso sofrimento, a nossa alegria, o nosso amor, o nosso aprendizado. Profundo e po??tico, com ilustra????es sens??veis de Laerte Silvino, o leitor encontra uma palavra que aquece o cora????o, que faz pensar, entender o que se passa com cada um de n??s e, muitas vezes, provoca um sorriso que chega aos olhos, com a certeza de que a autora escreveu o livro para cada um de n??s.",
				22.99, 23, "Poesia", dateFormat.parse("2021-05-11"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/31YfoJSOd9L._SX331_BO1,204,203,200_.jpg", 
				10.0, 
				"Todas as coisas que eu te escreveria se pudesse", 
				"Igor Pires", 
				"O novo livro de Igor Pires, autor da s??rie best-seller Textos cru??is demais para serem lidos rapidamente, que j?? vendeu mais de 750 mil exemplares. O autor nacional de fic????o mais lido em 2020, Igor Pires lan??a o quarto livro da s??rie Textos cru??is demais para serem lidos rapidamente. Em Todas as coisas que eu te escreveria se pudesse, Igor fala sobre amor, amar e deixar ir, ser intenso e abra??ar a sua intensidade. Sobre dizer e sentir tudo sem gaguejar. Sobre enfrentar a dor e aceitar que a cura ?? um processo cont??nuo, imprevis??vel, n??o linear.",
				23.99, 12, "Poesia", dateFormat.parse("2021-04-23"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41rdVVMGgvL._SX322_BO1,204,203,200_.jpg", 
				10.0, 
				"Textos cru??is demais para serem lidos rapidamente ??? Onde dorme o amor", 
				"Igor Pires", 
				"O segundo livro do coletivo liter??rio TCD mant??m toda a poesia e sensibilidade que encantou milhares de leitores. Nesta colet??nea de textos in??ditos, os autores exploram o amor, o perd??o e a cura em seus diversos aspectos, do modo po??tico e sens??vel que j?? lhes ?? caracter??stico. Prezando sempre pela pluralidade, Onde dorme o amor ?? um manifesto em prol do amor pr??prio e da aceita????o, e esmi????a as nuances, delicadezas e vulnerabilidades que perpassam os relacionamentos humanos. Com as not??veis ilustra????es de J??lio Almeida, este livro abra??a todas as complexidades de ser, desconstruindo conceitos e lugares-comuns.",
				22.99, 13, "Poesia", dateFormat.parse("2019-02-01"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51jBWqidqTL._SX324_BO1,204,203,200_.jpg", 
				10.0, 
				"Para ressignificar um grande amor", 
				"Akapoeta", 
				"Em seu novo livro, Jo??o Doederlein (Akapoeta) nos conduz por seu processo de cura e autoconhecimento, resgatando uma li????o importante para todos n??s: a vida n??o ?? feita de certezas, e recriar faz parte do ciclo.",
				19.99, 5, "Poesia", dateFormat.parse("2021-02-12"), false));

				// INFORM??TICA

				books.add(new Book("https://m.media-amazon.com/images/I/41-0kLuynTL.jpg", 
				10.0, 
				"Inform??tica - Conceitos B??sicos", 
				"Fernando Velloso", 
				"Cobrindo desde hardware at?? linguagens de programa????o, passando por redes de computadores, funcionamento da mem??ria, sistemas operacionais, l??gica de programa????o, tecnologia da informa????o e Internet, este livro ?? refer??ncia b??sica para estudantes que precisam conhecer melhor as bases dos atuais sistemas computacionais. A did??tica do autor, aperfei??oada ao longo dessas nove edi????es, permite que todos os interessados compreendam os conceitos mais abstratos de inform??tica.Inclus??o de um cap??tulo abordando Sistemas de Informa????o nas empresas: elementos???t??cnicos, sociais e organizacionais, necess??rios ?? intera????o dos processos e das pessoas com modernos recursos da TI.",
				98.99, 23, "Inform??tica", dateFormat.parse("2021-01-21"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41aHzYSXZkL._SX380_BO1,204,203,200_.jpg", 
				10.0, 
				"C??digo limpo: Habilidades pr??ticas do Agile Software", 
				"Robert C. Martin", 
				"Mesmo um c??digo ruim pode funcionar. Mas se ele n??o for limpo, pode acabar com uma empresa de desenvolvimento. Perdem-se a cada ano horas incont??veis e recursos importantes devido a um c??digo mal escrito. Mas n??o precisa ser assim.O renomado especialista em software, Robert C. Martin, apresenta um paradigma revolucion??rio com C??digo limpo: Habilidades Pr??ticas do Agile Software. Martin se reuniu com seus colegas do Mentor Object para destilar suas melhores e mais ??geis pr??ticas de limpar c??digos ???dinamicamente??? em um livro que introduzir?? gradualmente dentro de voc?? os valores da habilidade de um profissional de softwares e lhe tornar um programador melhor ???mas s?? se voc?? praticar.Que tipo de trabalho voc?? far??? Voc?? ler?? c??digos aqui, muitos c??digos. E voc?? dever?? descobrir o que est?? correto e errado nos c??digos. E, o mais importante, voc?? ter?? de reavaliar seus valores profissionais e seu comprometimento com o seu of??cio.C??digo limpo est?? divido em tr??s partes. Na primeira h?? diversos cap??tulos que descrevem os princ??pios, padr??es e pr??ticas para criar um c??digo limpo.A segunda parte consiste em diversos casos de estudo de complexidade cada vez maior. Cada um ?? um exerc??cio para limpar um c??digo ??? transformar o c??digo base que possui alguns problemas em um melhor e eficiente. A terceira parte ?? a compensa????o: um ??nico cap??tulo com uma lista de heur??sticas e ???odores??? reunidos durante a cria????o dos estudos de caso. O resultado ser?? um conhecimento base que descreve a forma como pensamos quando criamos, lemos e limpamos um c??digo.Ap??s ler este livro os leitores saber??o:??? Como distinguir um c??digo bom de um ruim??? Como escrever c??digos bons e como transformar um ruim em um bom??? Como criar bons nomes, boas fun????es, bons objetos e boas classes??? Como formatar o c??digo para ter uma legibilidade m??xima??? Como implementar completamente o tratamento de erro sem obscurecer a l??gica??? Como aplicar testes de unidade e praticar o desenvolvimento dirigido a testesEste livro ?? essencial para qualquer desenvolvedor, engenheiro de software, gerente de projeto, l??der de equipes ou analistas de sistemas com interesse em construir c??digos melhores.",
				64.99, 11, "Inform??tica", dateFormat.parse("2009-09-08"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/510jkCObwlL._SX348_BO1,204,203,200_.jpg", 
				10.0, 
				"Algoritmos e Programa????o com Exemplos em Pascal e C: Volume 23", 
				"Nina Edelweiss", 
				"Aprender programa????o n??o ?? uma tarefa simples. Requer um entendimento perfeito do problema, a an??lise de como solucion??-lo e a escolha da forma de implementa????o da solu????o. Algoritmos e programa????o com exemplos em Pascal e C apresenta o processo de constru????o de algoritmos e de programas, enfatizando as etapas de abstra????o, organiza????o, an??lise e cr??tica na busca de solu????es eficientes. Os elementos de um programa s??o introduzidos pouco a pouco ao longo do texto, inicialmente apresentados em pseudolinguagem e, em seguida, exemplificados nas linguagens de programa????o Pascal e C.",
				83.99, 12, "Inform??tica", dateFormat.parse("2014-05-21"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51Z4tWTdQPL._SX385_BO1,204,203,200_.jpg", 
				10.0, 
				"Provas e concursos - Inform??tica", 
				"Jo??o Paulo Colet", 
				"Revisado, ampliado e atualizado, essa ?? a nova edi????o do S??rie Provas & Concursos - Inform??tica, agora com 1106 Quest??es Comentadas, Simulados In??ditos, Dicion??rio de Termos ampliado e agora com principais Teclas de Atalho do Windows e os Comandos do Linux.",
				38.99, 11, "Inform??tica", dateFormat.parse("2019-08-26"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/5114ynRZxJL._SX348_BO1,204,203,200_.jpg", 
				10.0, 
				"Teoria da Computa????o - M??quinas Universais e Computabilidade: Volume 5", 
				"Tiaraj?? Asmuz Diverio", 
				"Aborda os principais aspectos relativos ?? teoria da computa????o de forma sistematizada e acess??vel.",
				86.99, 23, "Inform??tica", dateFormat.parse("2011-02-23"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41FteHEV3UL._SX346_BO1,204,203,200_.jpg", 
				10.0, 
				"Introdu????o ?? Abstra????o de Dados: Volume 21", 
				"Daltro J. Nunes", 
				"Trata-se de um livro que ensina a especificar, ou modelar, solu????es de problemas computacionais em alto n??vel de abstra????o e a desenvolver o racioc??nio algor??tmico. Para especificar solu????es de problemas, o livro utiliza uma linguagem de programa????o funcional denominada MAuDE. Assim, a atividade de especifica????o ou modelagem da solu????o de problemas torna-se prazerosa e gratificante, pois as especifica????es s??o interpret??veis (execut??veis) em qualquer computador, permitindo test??-las quanto a sua corretude.",
				18.99, 12, "Inform??tica", dateFormat.parse("2021-01-21"), false));


				// FANTASIA

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41LsFvFLBOS._SX340_BO1,204,203,200_.jpg", 
				10.0, 
				"A pris??o do rei", 
				"Victoria Aveyard", 
				"Mare Barrow foi capturada e passa os dias presa no pal??cio, impotente sem seu poder, atormentada por seus erros. Ela est?? ?? merc?? do garoto por quem um dia se apaixonou, um jovem dissimulado que a enganou e traiu. Agora rei, Maven continua com os planos de sua m??e, fazendo de tudo para manter o controle de Norta - e de sua prisioneira. Enquanto Mare tenta aguentar o peso sufocante das Pedras Silenciosas, o resto da Guarda Escarlate se organiza, treinando e expandindo. Com a rebeli??o cada vez mais forte, eles param de agir sob as sombras e se preparam para a guerra. Entre eles est?? Cal, um prateado em meio aos vermelhos. Incapaz de decidir a que lado dedicar sua lealdade, o pr??ncipe exilado s?? tem uma certeza: ele n??o vai descansar enquanto n??o trouxer Mare de volta.",
				31.99, 23, "Fantasia", dateFormat.parse("2017-03-01"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41QCVWkf5JL._SX341_BO1,204,203,200_.jpg", 
				10.0, 
				"Espada de vidro", 
				"Victoria Aveyard", 
				"O sangue de Mare Barrow ?? vermelho, da mesma cor da popula????o comum, mas sua habilidade de controlar a eletricidade a torna t??o poderosa quanto os membros da elite de sangue prateado. Depois que essa revela????o foi feita em rede nacional, Mare se transformou numa arma perigosa que a corte real quer esconder e controlar. Quando finalmente consegue escapar do pal??cio, Mare descobre algo surpreendente: ela n??o era a ??nica vermelha com poderes. Agora, enquanto foge, a garota el??trica tenta encontrar e recrutar outros sanguenovos como ela, para formar um ex??rcito contra a nobreza opressora. Essa ?? uma jornada perigosa, e Mare precisar?? tomar cuidado para n??o se tornar exatamente o tipo de monstro que ela est?? tentando deter.",
				31.99, 13, "Fantasia", dateFormat.parse("2016-02-04"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51d-LmLdCaL._SX324_BO1,204,203,200_.jpg", 
				10.0, 
				"O bosque das coisas perdidas", 
				"Shea Ernshaw", 
				"Quando dorme, a floresta lhe permitir?? uma passagem segura. Mas, se despertada, esteja preparado para correr! Envolvente e sorrateiro, O bosque das coisas perdidas vai te seduzir com magia e mist??rios at?? que voc?? esteja embrenhado demais em suas p??ginas para conseguir largar.",
				39.99, 23, "Fantasia", dateFormat.parse("2022-02-14"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51YnELNRMIL._SX335_BO1,204,203,200_.jpg", 
				10.0, 
				"Cidade da Lua Crescente: Casa de terra e sangue", 
				"Sarah J. Maas", 
				"Bryce Quinlan tinha a vida perfeita - trabalhava duro o dia todo e festejava noite adentro -, at?? que um dem??nio assassina alguns de seus melhores amigos, deixando-a destru??da e mudando sua vida para sempre. Sem entender como sobreviveu ao ataque da besta, a semife??rica tenta superar a perda, com o consolo de que o culpado por conjurar o dem??nio est?? atr??s das grades. Mas quando os crimes recome??am, dois anos depois e com as mesmas caracter??sticas, Bryce se v?? no meio de uma investiga????o que pode ajud??-la a vingar a morte dos amigos.",
				50.99, 23, "Fantasia", dateFormat.parse("2020-12-07"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51vAdsAJT7L._SX342_BO1,204,203,200_.jpg", 
				10.0, 
				"Crave a marca", 
				"Veronica Roth", 
				"???N??o h?? lugar para a honra na sobreviv??ncia.??? F??s de Star Wars e Divergente v??o adorar a nova s??rie de fantasia e fic????o cient??fica da escritora best-seller internacional Veronica Roth. Em um planeta onde a viol??ncia e a vingan??a imperam, em uma gal??xia onde alguns s??o afortunados, todos desenvolvem habilidades especiais ??? o dom-da-corrente ??? um poder ??nico para moldar o futuro. Enquanto a maioria se beneficia desses dons, Akos e Cyra n??o. Seus dons-da-corrente os tornam vulner??veis ao controle dos outros. Ser?? que v??o conseguir recuperar o controle de seus dons, de seus destinos e das pr??prias vidas, e ainda instaurar o equil??brio de poder no mundo? Cyra ?? irm?? de um tirano brutal que governa o povo de Shotet. Os dons especiais da jovem causam dor, mas trazem poder ??? algo explorado por seu irm??o, que a usa para torturar seus inimigos. Mas Cyra ?? muito mais do que uma arma na m??o do irm??o: ela tem uma resist??ncia fora do comum, o racioc??nio r??pido e ?? mais esperta do que ele imagina. Akos vem de Thuvhe, a na????o amante da paz, e a lealdade ?? sua fam??lia n??o tem limite. Mesmo protegido por um dom especial incomum, Akos n??o evita que ele e seu irm??o sejam capturados por soldados inimigos shotet. Akos se desespera e quer resgatar o irm??o vivo, n??o importa a que custo. Quando Akos ?? empurrado para o mundo de Cyra, a inimizade entre seus pa??ses e fam??lias parece intranspon??vel. Acreditando ser a ??nica sa??da, Akos decide se unir a Cyra. Uma uni??o que pode resultar na sobreviv??ncia ??? ou na destrui????o de ambos??? Numa narrativa eletrizante, no vi??s de Star Wars e Divergente, Veronica Roth explora ??? com equil??brio e pung??ncia ??? a hist??ria de um jovem que faz uma alian??a com o inimigo para escapar da opress??o que governa sua vida. Juntos, partem em busca de seus ??nicos objetivos: para um, a reden????o; para o outro, a vingan??a.",
				18.99, 21, "Fantasia", dateFormat.parse("2017-01-17"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41LsFvFLBOS._SX340_BO1,204,203,200_.jpg", 
				10.0, 
				"A vida invis??vel de Addie LaRue", 
				"V. E. Schwab", 
				"Uma vida que ningu??m lembra. Um livro que ningu??m esquece. Em A vida invis??vel de Addie LaRue, o aguardado best-seller de V.E. Schwab, conhe??a Addie e se perca em sua vida invis??vel ??? por??m memor??vel. Fran??a: 1714. Addie LaRue n??o queria pertercer a ningu??m ou a lugar nenhum. Em um momento de desespero, a jovem faz um pacto: a vida eterna, sob a condi????o de ser esquecida por quem a conhecer. Um piscar de olhos, e, como um sopro, Addie se vai. Uma virada de costas, e sua exist??ncia se dissipa na mem??ria de todos.",
				31.99, 23, "Fantasia", dateFormat.parse("2021-08-16"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41d3EwKB63L._SX339_BO1,204,203,200_.jpg", 
				10.0, 
				"Trono destru??do: Colet??nea definitiva da s??rie A Rainha Vermelha", 
				"Victoria Aveyard", 
				"Trono destru??do ?? uma colet??nea essencial para todos os leitores da s??rie best-seller de Victoria Aveyard que ficaram com vontade de passar mais tempo com os personagens depois do fim de Tempestade de guerra. Com design especial, o livro traz os dois contos j?? publicados (???Can????o da rainha??? e ???Cicatrizes de a??o???), al??m de quatro hist??rias in??ditas que dar??o aos leitores mais um vislumbre de seus personagens favoritos e a chance de conhecer caras novas.",
				42.99, 23, "Fantasia", dateFormat.parse("2019-05-17"), false));
				

				// INFORM??TICA

				books.add(new Book("https://m.media-amazon.com/images/I/41-0kLuynTL.jpg", 
				10.0, 
				"Inform??tica - Conceitos B??sicos", 
				"Fernando Velloso", 
				"Cobrindo desde hardware at?? linguagens de programa????o, passando por redes de computadores, funcionamento da mem??ria, sistemas operacionais, l??gica de programa????o, tecnologia da informa????o e Internet, este livro ?? refer??ncia b??sica para estudantes que precisam conhecer melhor as bases dos atuais sistemas computacionais. A did??tica do autor, aperfei??oada ao longo dessas nove edi????es, permite que todos os interessados compreendam os conceitos mais abstratos de inform??tica. Inclus??o de um cap??tulo abordando Sistemas de Informa????o nas empresas: elementos???t??cnicos, sociais e organizacionais, necess??rios ?? intera????o dos processos e das pessoas com modernos recursos da TI.",
				98.99, 23, "Inform??tica", dateFormat.parse("2021-01-21"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41aHzYSXZkL._SX380_BO1,204,203,200_.jpg", 
				10.0, 
				"C??digo limpo: Habilidades pr??ticas do Agile Software", 
				"Robert C. Martin", 
				"Mesmo um c??digo ruim pode funcionar. Mas se ele n??o for limpo, pode acabar com uma empresa de desenvolvimento. Perdem-se a cada ano horas incont??veis e recursos importantes devido a um c??digo mal escrito. Mas n??o precisa ser assim.O renomado especialista em software, Robert C. Martin, apresenta um paradigma revolucion??rio com C??digo limpo: Habilidades Pr??ticas do Agile Software. Martin se reuniu com seus colegas do Mentor Object para destilar suas melhores e mais ??geis pr??ticas de limpar c??digos ???dinamicamente??? em um livro que introduzir?? gradualmente dentro de voc?? os valores da habilidade de um profissional de softwares e lhe tornar um programador melhor ???mas s?? se voc?? praticar.Que tipo de trabalho voc?? far??? Voc?? ler?? c??digos aqui, muitos c??digos. E voc?? dever?? descobrir o que est?? correto e errado nos c??digos. E, o mais importante, voc?? ter?? de reavaliar seus valores profissionais e seu comprometimento com o seu of??cio.C??digo limpo est?? divido em tr??s partes. Na primeira h?? diversos cap??tulos que descrevem os princ??pios, padr??es e pr??ticas para criar um c??digo limpo.A segunda parte consiste em diversos casos de estudo de complexidade cada vez maior. Cada um ?? um exerc??cio para limpar um c??digo ??? transformar o c??digo base que possui alguns problemas em um melhor e eficiente. A terceira parte ?? a compensa????o: um ??nico cap??tulo com uma lista de heur??sticas e ???odores??? reunidos durante a cria????o dos estudos de caso. O resultado ser?? um conhecimento base que descreve a forma como pensamos quando criamos, lemos e limpamos um c??digo.Ap??s ler este livro os leitores saber??o:??? Como distinguir um c??digo bom de um ruim??? Como escrever c??digos bons e como transformar um ruim em um bom??? Como criar bons nomes, boas fun????es, bons objetos e boas classes??? Como formatar o c??digo para ter uma legibilidade m??xima??? Como implementar completamente o tratamento de erro sem obscurecer a l??gica??? Como aplicar testes de unidade e praticar o desenvolvimento dirigido a testesEste livro ?? essencial para qualquer desenvolvedor, engenheiro de software, gerente de projeto, l??der de equipes ou analistas de sistemas com interesse em construir c??digos melhores.",
				64.99, 11, "Inform??tica", dateFormat.parse("2009-09-08"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/510jkCObwlL._SX348_BO1,204,203,200_.jpg", 
				10.0, 
				"Algoritmos e Programa????o com Exemplos em Pascal e C: Volume 23", 
				"Nina Edelweiss", 
				"Aprender programa????o n??o ?? uma tarefa simples. Requer um entendimento perfeito do problema, a an??lise de como solucion??-lo e a escolha da forma de implementa????o da solu????o. Algoritmos e programa????o com exemplos em Pascal e C apresenta o processo de constru????o de algoritmos e de programas, enfatizando as etapas de abstra????o, organiza????o, an??lise e cr??tica na busca de solu????es eficientes. Os elementos de um programa s??o introduzidos pouco a pouco ao longo do texto, inicialmente apresentados em pseudolinguagem e, em seguida, exemplificados nas linguagens de programa????o Pascal e C.",
				83.99, 12, "Inform??tica", dateFormat.parse("2014-05-21"), false));

				books.add(new Book("https://m.media-amazon.com/images/I/41-0kLuynTL.jpg", 
				10.0, 
				"Matem??tica Discreta para Computa????o e Inform??tica: Volume 16", 
				"Paulo Blauth Menezes", 
				"Os principais conceitos de matem??tica discreta em uma linguagem simples e acess??vel. Essa disciplina discreta ?? considerada pelos alunos especialmente dif??cil, mais do que a de c??lculo, muitas vezes. Com isso em mente, o autor procurou dar ??nfase aos aspectos did??ticos, buscando texto simples e acess??vel, sem abrir m??o dos aspectos matem??ticos formais. A 4.ed. traz um cap??tulo novo sobre recurs??o, cuja abordagem foi desmembrada daquela sobre indu????o.",
				93.99, 52, "Inform??tica", dateFormat.parse("2013-03-26"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51Z4tWTdQPL._SX385_BO1,204,203,200_.jpg", 
				10.0, 
				"Provas e concursos - Inform??tica", 
				"Jo??o Paulo Colet", 
				"Revisado, ampliado e atualizado, essa ?? a nova edi????o do S??rie Provas & Concursos - Inform??tica, agora com 1106 Quest??es Comentadas, Simulados In??ditos, Dicion??rio de Termos ampliado e agora com principais Teclas de Atalho do Windows e os Comandos do Linux.",
				38.99, 11, "Inform??tica", dateFormat.parse("2019-08-26"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/5114ynRZxJL._SX348_BO1,204,203,200_.jpg", 
				10.0, 
				"Teoria da Computa????o - M??quinas Universais e Computabilidade: Volume 5", 
				"Tiaraj?? Asmuz Diverio", 
				"Aborda os principais aspectos relativos ?? teoria da computa????o de forma sistematizada e acess??vel.",
				86.99, 23, "Inform??tica", dateFormat.parse("2011-02-23"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41FteHEV3UL._SX346_BO1,204,203,200_.jpg", 
				10.0, 
				"Introdu????o ?? Abstra????o de Dados: Volume 21", 
				"Daltro J. Nunes", 
				"Trata-se de um livro que ensina a especificar, ou modelar, solu????es de problemas computacionais em alto n??vel de abstra????o e a desenvolver o racioc??nio algor??tmico. Para especificar solu????es de problemas, o livro utiliza uma linguagem de programa????o funcional denominada MAuDE. Assim, a atividade de especifica????o ou modelagem da solu????o de problemas torna-se prazerosa e gratificante, pois as especifica????es s??o interpret??veis (execut??veis) em qualquer computador, permitindo test??-las quanto a sua corretude.",
				98.99, 12, "Inform??tica", dateFormat.parse("2021-01-21"), false));
				

				// BIOGRAFIA

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/519+lK+QruL._SX331_BO1,204,203,200_.jpg", 
				10.0, 
				"Minha vida, minha obra", 
				"Henry Ford", 
				"Uma hist??ria de vida inspiradora de um grande homem, cujos princ??pios o guiaram a se tornar uma das figuras mais marcantes da hist??ria industrial norte-americana. Este livro, embora publicado h?? quase cem anos, d?? uma receita ainda atual e oportuna do que ?? preciso para qualquer empres??rio ter sucesso e deve ser lido por qualquer pessoa interessada no que ?? necess??rio para fazer parte do verdadeiro sonho americano, uma no????o que hoje se mant??m apenas por um fio nos Estados Unidos. Uma obra que vai al??m das t??cnicas para o sucesso trata-se de como fazer uma diferen??a verdadeiramente positiva para o indiv??duo, os funcion??rios e o pa??s como um todo.",
				13.99, 13, "Biografia", dateFormat.parse("2021-04-24"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41n4JacnNhL._SX339_BO1,204,203,200_.jpg", 
				10.0, 
				"Silvio Santos: A biografia", 
				"Marcia Batista", 
				"Seu nome ?? Senor Abravanel, mais conhecido como Silvio Santos. Sua caracter??stica mais marcante ?? a generosidade, eternizada no famoso bord??o 'quem quer dinheiro?'. A boa ??ndole de Silvio Santos, inclusive, ?? uma faceta de sua personalidade, a qual dez em cada dez de seus funcion??rios faz quest??o de ressaltar. Compreendendo os 86 anos da figura ic??nica que impactou a hist??ria e a rotina de milh??es de brasileiros, este livro revela, inclusive por meio de relatos e documentos exclusivos, as conquistas e dificuldades que Silvio enfrentou para ser a unanimidade que ?? hoje: o lado fam??lia, o apresentador, o gestor de neg??cios, o descobridor de talentos, como se deram seus insights de empreendedor, al??m de in??meras passagens impressionantes de uma trajet??ria riqu??ssima e encorajadora.",
				20.99, 15, "Biografia", dateFormat.parse("2020-01-31"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/511Df6TjJeS._SX339_BO1,204,203,200_.jpg", 
				10.0, 
				"Van Gogh", 
				"Steven Naifeh", 
				"Mestre da pintura do s??culo XIX e profeta da arte moderna, Vincent Willem van Gogh (18531890) nasceu num vilarejo fronteiri??o nos confins pantanosos do sul da Holanda, filho primog??nito de um modesto pastor protestante. Solit??rio e impetuoso desde crian??a, o artista fracassou em todas as tentativas de se fixar numa profiss??o ???respeit??vel???. Somente encontrou al??vio parcial para seus anseios excruciantes na produ????o de milhares de desenhos e pinturas, ao mesmo tempo em que submergia na doen??a e na loucura. Steven Naifeh e Gregory White Smith apresentam nesta monumental reconstitui????o biogr??fica uma vis??o ao mesmo tempo erudita e apaixonada sobre o artista holand??s. Os autores, respons??veis por uma biografia de Jackson Pollock (in??dita no Brasil e inspiradora do filme Pollock, de 2000), esmi????am o conturbado relacionamento com os pais, a amizade com o irm??o Theo, a rela????o intensa com a religi??o, a err??ncia entre diversas cidades, a vida sexual desregrada, o fracasso em vender suas obras, a amizade conturbada com Paul Gauguin, a loucura, a orelha mutilada - e sugere uma explica????o surpreendente para o suposto suic??dio.",
				83.99, 12, "Biografia", dateFormat.parse("2012-11-29"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41nb7Y5t6QL._SX331_BO1,204,203,200_.jpg", 
				10.0, 
				"Uma terra prometida", 
				"Barack Obama", 
				"No comovente e aguardado primeiro volume de suas mem??rias presidenciais, Barack Obama narra, nas pr??prias palavras, a hist??ria de sua odisseia improv??vel, desde quando era um jovem em busca de sua identidade at?? se tornar l??der da maior democracia do mundo. Com detalhes surpreendentes, ele descreve sua forma????o pol??tica e os momentos marcantes do primeiro mandato de sua presid??ncia hist??rica ??? ??poca de turbul??ncias e transforma????es dr??sticas. Obama conduz os leitores atrav??s de uma jornada cativante, que inclui suas primeiras aspira????es pol??ticas, a vit??ria crucial nas prim??rias de Iowa, na qual se demonstrou a for??a do ativismo popular, e a noite decisiva de 4 de novembro de 2008, quando foi eleito 44?? presidente dos Estados Unidos, o primeiro afro-americano a ocupar o cargo mais alto do pa??s.",
				56.99, 11, "Biografia", dateFormat.parse("2020-11-17"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41ZuoTrqboL._SX335_BO1,204,203,200_.jpg", 
				10.0, 
				"Diana: Sua verdadeira hist??ria", 
				"Andrew Morton", 
				"A morte tr??gica e inesperada da princesa Diana, em 1997, chocou o planeta ??? e comove o p??blico at?? hoje. Diana: Sua verdadeira hist??ria ?? a ??nica biografia autorizada da princesa, escrita por Andrew Morton com a ajuda da pr??pria Diana por meio de fitas gravadas no momento da pior crise de seu casamento e de sua depress??o.",
				22.99, 8, "Biografia", dateFormat.parse("2013-10-21"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/410nkZsUG2L._SX331_BO1,204,203,200_.jpg", 
				10.0, 
				"A biografia de Novak Djokovic", 
				"Blaza Popovic", 
				"A vida de Novak Djokovic ?? uma verdadeira saga e um exemplo inspirador para praticantes e amantes de esportes em geral e do t??nis, de todas as idades. Nascido e crescido na S??rvia, pa??s que em anos recentes esteve envolvido em guerras, conflitos ??tnico-religiosos e crises pol??tico-econ??micas, Djoko, como ?? carinhosamente chamado pelos f??s, possui uma trajet??ria de supera????o de obst??culos, extrema for??a de vontade e resili??ncia. Mas por que Djokovic se tornou um campe??o? Quais desafios ele enfrentou para alcan??ar o topo do ranking mundial? Como pensa e age? Quais os seus valores e cren??as? Afinal, quem ?? Novak Djokovic, dentro e fora das quadras? O livro traz respostas a todas essas perguntas ao contar a sua vida desde quando segurou uma raquete na inf??ncia, passando por sua adolesc??ncia e participa????o nos primeiros torneios internacionais, at?? a sua ascens??o e perman??ncia no topo do ranking mundial do t??nis. Pela primeira vez, os bastidores da carreira e vida particular desse ??dolo s??o revelados. Uma leitura emocionante, divertida e surpreendente!",
				94.99, 9, "Biografia", dateFormat.parse("2013-05-01"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51he3wIEopL._SX335_BO1,204,203,200_.jpg", 
				10.0, 
				"Lincoln", 
				"Doris Kearns Goodwin", 
				"Ao fazer uma an??lise do estilo de lideran??a de Abraham Lincoln, da maneira como ele entendia o comportamento humano e das alian??as que construiu em seu governo, a premiada historiadora Doris Kearns Goodwin escreveu uma detalhada biografia de um dos mais emblem??ticos presidentes norte-americanos. Um livro fundamental para o entendimento da Guerra Civil Americana e seus principais personagens. Al??m de esmiu??ar o car??ter e a carreira de Abraham Lincoln, a autora relata tamb??m a hist??ria dos homens extraordin??rios que foram seus rivais na indica????o para a candidatura ?? presid??ncia pelo Partido Republicano em 1860: o senador de Nova York William H. Seward, o governador de Ohio Salmon P. Chase, e o s??bio e ilustre estadista do Missouri Edward Bates. Seward seria nomeado secret??rio de Estado, Chase, secret??rio do Tesouro, e Bates, secret??rio de Justi??a.",
				41.99, 21, "Biografia", dateFormat.parse("2013-01-15"), false));
		return books;
	}
    
}
