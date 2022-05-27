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
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/71cCAucztCL.jpg", 10.0, "Em busca de nós mesmos", "Beth Evans", "A vida adulta não é fácil. E quem nunca fuxicou as redes sociais de amigos bem-sucedidos, só para se comparar, e acabou se sentindo pior ainda, que atire a primeira pedra.",
				10.95, 5, "Autoajuda", dateFormat.parse("2019-08-31"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51Xby92J9KL._SX346_BO1,204,203,200_.jpg", 10.0, "O poder do hábito", "Charles Duhigg", "O que todas essas pessoas tem em comum? Conseguiram ter sucesso focando em padrões que moldam cada aspecto de nossas vidas. Tiveram êxito transformando hábitos. Com perspicácia e habilidade, Charles Duhigg apresenta um novo entendimento da natureza humana e seu potencial para a transformação.",
				12.90, 10, "Autoajuda", dateFormat.parse("2012-09-24"), true));
		
		books.add(new Book("https://m.media-amazon.com/images/I/41+7a4RuENL.jpg", 10.0, "Mindset: A nova psicologia do sucesso", "Carol Dweck", "Carol S. Dweck, professora de psicologia na Universidade Stanford e especialista internacional em sucesso e motivação, desenvolveu, ao longo de décadas de pesquisa, um conceito fundamental: a atitude mental com que encaramos a vida, que ela chama de \"mindset\", é crucial para o sucesso. Dweck revela de forma brilhante como o sucesso pode ser alcançado pela maneira como lidamos com nossos objetivos.",
				26.19, 5, "Autoajuda", dateFormat.parse("2014-01-24"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51ilQPPPanL._SX339_BO1,204,203,200_.jpg", 10.0, "Mindset: A nova psicologia do sucesso", "Paulo Vieira", "Acorde para os objetivos que quer conquistar. Já aconteceu a você de se olhar no espelho e não gostar daqueles quilos a mais? De observar seu momento profissional somente com frustração? De se sentir desconectado dos seus familiares, dos seus amigos? Se você acha que essas são situações normais, pense de novo! Só porque isso acontece com várias pessoas não quer dizer que a vida deva ser assim. Só porque algo se torna comum, não significa que seja normal! ",
				19.99, 5, "Autoajuda", dateFormat.parse("2015-06-01"), true));
		
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/6175IU0qFgL.jpg", 10.0, "A Sutil Arte de Ligar o F*da-Se: Uma Estratégia Inusitada Para Uma Vida Melhor", "Mark Manson", "Coaching, autoajuda, desenvolvimento pessoal, mentalização positiva - sem querer desprezar o valor de nada disso, a grande verdade é que às vezes nos sentimos quase sufocados diante da pressão infinita por parecermos otimistas o tempo todo. É um pecado social se deixar abater quando as coisas não vão bem. Ninguém pode fracassar simplesmente, sem aprender nada com isso. Não dá mais. É insuportável. E é aí que entra a revolucionária e sutil arte de ligar o foda-se.",
				99.95, 5, "Autoajuda", dateFormat.parse("2017-10-06"), true));
		//Poesia
		books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/61CA3Q4FNRL._SX331_BO1,204,203,200_.jpg", 
				10.0, 
				"O livro dos ressignificados", 
				"Akapoeta", 
				"Releituras poéticas em que experiências pessoais com substantivos, adjetivos e verbos pesam mais do que a objetividade dos dicionários. Antes aprisionadas na formalidade dos dicionários, palavras como “girassol”, “Deus”, “sonho”, “tatuagem”, “cafuné” e muitas outras são libertadas por João Doederlein ― que assina com o pseudônimo Akapoeta ― neste seu primeiro livro. Elas são repensadas a partir das experiências pessoais do autor, de vinte anos, e de sua geração, mesclando romantismo bem resolvido, paixão, isolamento e um dia a dia que respira tecnologia e cultura pop.",
				30.99, 5, "Poesia", dateFormat.parse("2022-08-28"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/61hvOHFthkL._SX373_BO1,204,203,200_.jpg", 
				10.0, 
				"De amor tenho vivido: 50 poemas", 
				"Hilda Hilst", 
				"Nesta breve coletânea, ilustrada pela artista Ana Prata, o leitor vai conhecer as muitas faces da poeta que se dedicou ao amor com total devoção. Do primeiro livro de poesia, Presságio, de 1950, até o último, Cantares do sem nome e de partidas, de 1995, o amor atravessa toda a produção poética de Hilda Hilst. Em constante diálogo com a tradição de odes, trovas e cantares, os poemas tematizam o amor em suas múltiplas formas: a entrega ao amado, o desejo ardente, a expectativa pelo encontro, o medo da despedida.",
				40.99, 4, "Poesia", dateFormat.parse("2018-06-01"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41+YyEDgNjL._SY331_BO1,204,203,200_.jpg", 
				10.0, 
				"Box Obra poética de Fernando Pessoa", 
				"Fernando Pessoa", 
				"A vasta produção de Fernando Pessoa, um dos mais célebres poetas em língua portuguesa, ganha uma nova edição pela Nova Fronteira, dividida em dois volumes contidos em boxe de luxo. A obra contempla os poemas escritos por Pessoa como ele mesmo e como outros poetas que criou, seus famosos heterônimos Alberto Caeiro, Ricardo Reis e Álvaro de Campos, além da produção poética do autor em língua estrangeira e de algumas de suas traduções.",
				75.99, 15, "Poesia", dateFormat.parse("2021-10-31"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/21rlFX39SNL._SX363_BO1,204,203,200_.jpg", 
				10.0, 
				"Coisas que guardei pra mim", 
				"Samara A. Buchweitz", 
				"Coisas que guardei para mim conduz o leitor à reflexão sobre tudo aquilo que costumamos guardar para nós mesmos sem externarmos: o nosso sofrimento, a nossa alegria, o nosso amor, o nosso aprendizado. Profundo e poético, com ilustrações sensíveis de Laerte Silvino, o leitor encontra uma palavra que aquece o coração, que faz pensar, entender o que se passa com cada um de nós e, muitas vezes, provoca um sorriso que chega aos olhos, com a certeza de que a autora escreveu o livro para cada um de nós.",
				22.99, 23, "Poesia", dateFormat.parse("2021-05-11"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/31YfoJSOd9L._SX331_BO1,204,203,200_.jpg", 
				10.0, 
				"Todas as coisas que eu te escreveria se pudesse", 
				"Igor Pires", 
				"O novo livro de Igor Pires, autor da série best-seller Textos cruéis demais para serem lidos rapidamente, que já vendeu mais de 750 mil exemplares. O autor nacional de ficção mais lido em 2020, Igor Pires lança o quarto livro da série Textos cruéis demais para serem lidos rapidamente. Em Todas as coisas que eu te escreveria se pudesse, Igor fala sobre amor, amar e deixar ir, ser intenso e abraçar a sua intensidade. Sobre dizer e sentir tudo sem gaguejar. Sobre enfrentar a dor e aceitar que a cura é um processo contínuo, imprevisível, não linear.",
				23.99, 12, "Poesia", dateFormat.parse("2021-04-23"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41rdVVMGgvL._SX322_BO1,204,203,200_.jpg", 
				10.0, 
				"Textos cruéis demais para serem lidos rapidamente – Onde dorme o amor", 
				"Igor Pires", 
				"O segundo livro do coletivo literário TCD mantém toda a poesia e sensibilidade que encantou milhares de leitores. Nesta coletânea de textos inéditos, os autores exploram o amor, o perdão e a cura em seus diversos aspectos, do modo poético e sensível que já lhes é característico. Prezando sempre pela pluralidade, Onde dorme o amor é um manifesto em prol do amor próprio e da aceitação, e esmiúça as nuances, delicadezas e vulnerabilidades que perpassam os relacionamentos humanos. Com as notáveis ilustrações de Júlio Almeida, este livro abraça todas as complexidades de ser, desconstruindo conceitos e lugares-comuns.",
				22.99, 13, "Poesia", dateFormat.parse("2019-02-01"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51jBWqidqTL._SX324_BO1,204,203,200_.jpg", 
				10.0, 
				"Para ressignificar um grande amor", 
				"Akapoeta", 
				"Em seu novo livro, João Doederlein (Akapoeta) nos conduz por seu processo de cura e autoconhecimento, resgatando uma lição importante para todos nós: a vida não é feita de certezas, e recriar faz parte do ciclo.",
				19.99, 5, "Poesia", dateFormat.parse("2021-02-12"), false));

				// INFORMÁTICA

				books.add(new Book("https://m.media-amazon.com/images/I/41-0kLuynTL.jpg", 
				10.0, 
				"Informática - Conceitos Básicos", 
				"Fernando Velloso", 
				"Cobrindo desde hardware até linguagens de programação, passando por redes de computadores, funcionamento da memória, sistemas operacionais, lógica de programação, tecnologia da informação e Internet, este livro é referência básica para estudantes que precisam conhecer melhor as bases dos atuais sistemas computacionais. A didática do autor, aperfeiçoada ao longo dessas nove edições, permite que todos os interessados compreendam os conceitos mais abstratos de informática.Inclusão de um capítulo abordando Sistemas de Informação nas empresas: elementos　técnicos, sociais e organizacionais, necessários à interação dos processos e das pessoas com modernos recursos da TI.",
				108.99, 23, "Informática", dateFormat.parse("2021-01-21"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41aHzYSXZkL._SX380_BO1,204,203,200_.jpg", 
				10.0, 
				"Código limpo: Habilidades práticas do Agile Software", 
				"Robert C. Martin", 
				"Mesmo um código ruim pode funcionar. Mas se ele não for limpo, pode acabar com uma empresa de desenvolvimento. Perdem-se a cada ano horas incontáveis e recursos importantes devido a um código mal escrito. Mas não precisa ser assim.O renomado especialista em software, Robert C. Martin, apresenta um paradigma revolucionário com Código limpo: Habilidades Práticas do Agile Software. Martin se reuniu com seus colegas do Mentor Object para destilar suas melhores e mais ágeis práticas de limpar códigos “dinamicamente” em um livro que introduzirá gradualmente dentro de você os valores da habilidade de um profissional de softwares e lhe tornar um programador melhor –mas só se você praticar.Que tipo de trabalho você fará? Você lerá códigos aqui, muitos códigos. E você deverá descobrir o que está correto e errado nos códigos. E, o mais importante, você terá de reavaliar seus valores profissionais e seu comprometimento com o seu ofício.Código limpo está divido em três partes. Na primeira há diversos capítulos que descrevem os princípios, padrões e práticas para criar um código limpo.A segunda parte consiste em diversos casos de estudo de complexidade cada vez maior. Cada um é um exercício para limpar um código – transformar o código base que possui alguns problemas em um melhor e eficiente. A terceira parte é a compensação: um único capítulo com uma lista de heurísticas e “odores” reunidos durante a criação dos estudos de caso. O resultado será um conhecimento base que descreve a forma como pensamos quando criamos, lemos e limpamos um código.Após ler este livro os leitores saberão:✔ Como distinguir um código bom de um ruim✔ Como escrever códigos bons e como transformar um ruim em um bom✔ Como criar bons nomes, boas funções, bons objetos e boas classes✔ Como formatar o código para ter uma legibilidade máxima✔ Como implementar completamente o tratamento de erro sem obscurecer a lógica✔ Como aplicar testes de unidade e praticar o desenvolvimento dirigido a testesEste livro é essencial para qualquer desenvolvedor, engenheiro de software, gerente de projeto, líder de equipes ou analistas de sistemas com interesse em construir códigos melhores.",
				64.99, 11, "Informática", dateFormat.parse("2009-09-08"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/510jkCObwlL._SX348_BO1,204,203,200_.jpg", 
				10.0, 
				"Algoritmos e Programação com Exemplos em Pascal e C: Volume 23", 
				"Nina Edelweiss", 
				"Aprender programação não é uma tarefa simples. Requer um entendimento perfeito do problema, a análise de como solucioná-lo e a escolha da forma de implementação da solução. Algoritmos e programação com exemplos em Pascal e C apresenta o processo de construção de algoritmos e de programas, enfatizando as etapas de abstração, organização, análise e crítica na busca de soluções eficientes. Os elementos de um programa são introduzidos pouco a pouco ao longo do texto, inicialmente apresentados em pseudolinguagem e, em seguida, exemplificados nas linguagens de programação Pascal e C.",
				83.99, 12, "Informática", dateFormat.parse("2014-05-21"), false));

				books.add(new Book("https://m.media-amazon.com/images/I/41-0kLuynTL.jpg", 
				10.0, 
				"Matemática Discreta para Computação e Informática: Volume 16", 
				"Paulo Blauth Menezes", 
				"Os principais conceitos de matemática discreta em uma linguagem simples e acessível. Essa disciplina discreta é considerada pelos alunos especialmente difícil, mais do que a de cálculo, muitas vezes. Com isso em mente, o autor procurou dar ênfase aos aspectos didáticos, buscando texto simples e acessível, sem abrir mão dos aspectos matemáticos formais. A 4.ed. traz um capítulo novo sobre recursão, cuja abordagem foi desmembrada daquela sobre indução.",
				103.99, 52, "Informática", dateFormat.parse("2013-03-26"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51Z4tWTdQPL._SX385_BO1,204,203,200_.jpg", 
				10.0, 
				"Provas e concursos - Informática", 
				"João Paulo Colet", 
				"Revisado, ampliado e atualizado, essa é a nova edição do Série Provas & Concursos - Informática, agora com 1106 Questões Comentadas, Simulados Inéditos, Dicionário de Termos ampliado e agora com principais Teclas de Atalho do Windows e os Comandos do Linux.",
				38.99, 11, "Informática", dateFormat.parse("2019-08-26"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/5114ynRZxJL._SX348_BO1,204,203,200_.jpg", 
				10.0, 
				"Teoria da Computação - Máquinas Universais e Computabilidade: Volume 5", 
				"Tiarajú Asmuz Diverio", 
				"Aborda os principais aspectos relativos à teoria da computação de forma sistematizada e acessível.",
				86.99, 23, "Informática", dateFormat.parse("2011-02-23"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41FteHEV3UL._SX346_BO1,204,203,200_.jpg", 
				10.0, 
				"Introdução à Abstração de Dados: Volume 21", 
				"Daltro J. Nunes", 
				"Trata-se de um livro que ensina a especificar, ou modelar, soluções de problemas computacionais em alto nível de abstração e a desenvolver o raciocínio algorítmico. Para especificar soluções de problemas, o livro utiliza uma linguagem de programação funcional denominada MAuDE. Assim, a atividade de especificação ou modelagem da solução de problemas torna-se prazerosa e gratificante, pois as especificações são interpretáveis (executáveis) em qualquer computador, permitindo testá-las quanto a sua corretude.",
				108.99, 12, "Informática", dateFormat.parse("2021-01-21"), false));


				// FANTASIA

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41LsFvFLBOS._SX340_BO1,204,203,200_.jpg", 
				10.0, 
				"A prisão do rei", 
				"Victoria Aveyard", 
				"Mare Barrow foi capturada e passa os dias presa no palácio, impotente sem seu poder, atormentada por seus erros. Ela está à mercê do garoto por quem um dia se apaixonou, um jovem dissimulado que a enganou e traiu. Agora rei, Maven continua com os planos de sua mãe, fazendo de tudo para manter o controle de Norta - e de sua prisioneira. Enquanto Mare tenta aguentar o peso sufocante das Pedras Silenciosas, o resto da Guarda Escarlate se organiza, treinando e expandindo. Com a rebelião cada vez mais forte, eles param de agir sob as sombras e se preparam para a guerra. Entre eles está Cal, um prateado em meio aos vermelhos. Incapaz de decidir a que lado dedicar sua lealdade, o príncipe exilado só tem uma certeza: ele não vai descansar enquanto não trouxer Mare de volta.",
				31.99, 23, "Fantasia", dateFormat.parse("2017-03-01"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41QCVWkf5JL._SX341_BO1,204,203,200_.jpg", 
				10.0, 
				"Espada de vidro", 
				"Victoria Aveyard", 
				"O sangue de Mare Barrow é vermelho, da mesma cor da população comum, mas sua habilidade de controlar a eletricidade a torna tão poderosa quanto os membros da elite de sangue prateado. Depois que essa revelação foi feita em rede nacional, Mare se transformou numa arma perigosa que a corte real quer esconder e controlar. Quando finalmente consegue escapar do palácio, Mare descobre algo surpreendente: ela não era a única vermelha com poderes. Agora, enquanto foge, a garota elétrica tenta encontrar e recrutar outros sanguenovos como ela, para formar um exército contra a nobreza opressora. Essa é uma jornada perigosa, e Mare precisará tomar cuidado para não se tornar exatamente o tipo de monstro que ela está tentando deter.",
				31.99, 13, "Fantasia", dateFormat.parse("2016-02-04"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51d-LmLdCaL._SX324_BO1,204,203,200_.jpg", 
				10.0, 
				"O bosque das coisas perdidas", 
				"Shea Ernshaw", 
				"Quando dorme, a floresta lhe permitirá uma passagem segura. Mas, se despertada, esteja preparado para correr! Envolvente e sorrateiro, O bosque das coisas perdidas vai te seduzir com magia e mistérios até que você esteja embrenhado demais em suas páginas para conseguir largar.",
				39.99, 23, "Fantasia", dateFormat.parse("2022-02-14"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51YnELNRMIL._SX335_BO1,204,203,200_.jpg", 
				10.0, 
				"Cidade da Lua Crescente: Casa de terra e sangue", 
				"Sarah J. Maas", 
				"Bryce Quinlan tinha a vida perfeita - trabalhava duro o dia todo e festejava noite adentro -, até que um demônio assassina alguns de seus melhores amigos, deixando-a destruída e mudando sua vida para sempre. Sem entender como sobreviveu ao ataque da besta, a semifeérica tenta superar a perda, com o consolo de que o culpado por conjurar o demônio está atrás das grades. Mas quando os crimes recomeçam, dois anos depois e com as mesmas características, Bryce se vê no meio de uma investigação que pode ajudá-la a vingar a morte dos amigos.",
				50.99, 23, "Fantasia", dateFormat.parse("2020-12-07"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51vAdsAJT7L._SX342_BO1,204,203,200_.jpg", 
				10.0, 
				"Crave a marca", 
				"Veronica Roth", 
				"“Não há lugar para a honra na sobrevivência.” Fãs de Star Wars e Divergente vão adorar a nova série de fantasia e ficção científica da escritora best-seller internacional Veronica Roth. Em um planeta onde a violência e a vingança imperam, em uma galáxia onde alguns são afortunados, todos desenvolvem habilidades especiais – o dom-da-corrente – um poder único para moldar o futuro. Enquanto a maioria se beneficia desses dons, Akos e Cyra não. Seus dons-da-corrente os tornam vulneráveis ao controle dos outros. Será que vão conseguir recuperar o controle de seus dons, de seus destinos e das próprias vidas, e ainda instaurar o equilíbrio de poder no mundo? Cyra é irmã de um tirano brutal que governa o povo de Shotet. Os dons especiais da jovem causam dor, mas trazem poder – algo explorado por seu irmão, que a usa para torturar seus inimigos. Mas Cyra é muito mais do que uma arma na mão do irmão: ela tem uma resistência fora do comum, o raciocínio rápido e é mais esperta do que ele imagina. Akos vem de Thuvhe, a nação amante da paz, e a lealdade à sua família não tem limite. Mesmo protegido por um dom especial incomum, Akos não evita que ele e seu irmão sejam capturados por soldados inimigos shotet. Akos se desespera e quer resgatar o irmão vivo, não importa a que custo. Quando Akos é empurrado para o mundo de Cyra, a inimizade entre seus países e famílias parece intransponível. Acreditando ser a única saída, Akos decide se unir a Cyra. Uma união que pode resultar na sobrevivência – ou na destruição de ambos… Numa narrativa eletrizante, no viés de Star Wars e Divergente, Veronica Roth explora – com equilíbrio e pungência – a história de um jovem que faz uma aliança com o inimigo para escapar da opressão que governa sua vida. Juntos, partem em busca de seus únicos objetivos: para um, a redenção; para o outro, a vingança.",
				18.99, 21, "Fantasia", dateFormat.parse("2017-01-17"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41LsFvFLBOS._SX340_BO1,204,203,200_.jpg", 
				10.0, 
				"A vida invisível de Addie LaRue", 
				"V. E. Schwab", 
				"Uma vida que ninguém lembra. Um livro que ninguém esquece. Em A vida invisível de Addie LaRue, o aguardado best-seller de V.E. Schwab, conheça Addie e se perca em sua vida invisível — porém memorável. França: 1714. Addie LaRue não queria pertercer a ninguém ou a lugar nenhum. Em um momento de desespero, a jovem faz um pacto: a vida eterna, sob a condição de ser esquecida por quem a conhecer. Um piscar de olhos, e, como um sopro, Addie se vai. Uma virada de costas, e sua existência se dissipa na memória de todos.",
				31.99, 23, "Fantasia", dateFormat.parse("2021-08-16"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41d3EwKB63L._SX339_BO1,204,203,200_.jpg", 
				10.0, 
				"Trono destruído: Coletânea definitiva da série A Rainha Vermelha", 
				"Victoria Aveyard", 
				"Trono destruído é uma coletânea essencial para todos os leitores da série best-seller de Victoria Aveyard que ficaram com vontade de passar mais tempo com os personagens depois do fim de Tempestade de guerra. Com design especial, o livro traz os dois contos já publicados (“Canção da rainha” e “Cicatrizes de aço”), além de quatro histórias inéditas que darão aos leitores mais um vislumbre de seus personagens favoritos e a chance de conhecer caras novas.",
				42.99, 23, "Fantasia", dateFormat.parse("2019-05-17"), false));
				

				// INFORMÁTICA

				books.add(new Book("https://m.media-amazon.com/images/I/41-0kLuynTL.jpg", 
				10.0, 
				"Informática - Conceitos Básicos", 
				"Fernando Velloso", 
				"Cobrindo desde hardware até linguagens de programação, passando por redes de computadores, funcionamento da memória, sistemas operacionais, lógica de programação, tecnologia da informação e Internet, este livro é referência básica para estudantes que precisam conhecer melhor as bases dos atuais sistemas computacionais. A didática do autor, aperfeiçoada ao longo dessas nove edições, permite que todos os interessados compreendam os conceitos mais abstratos de informática. Inclusão de um capítulo abordando Sistemas de Informação nas empresas: elementos　técnicos, sociais e organizacionais, necessários à interação dos processos e das pessoas com modernos recursos da TI.",
				108.99, 23, "Informática", dateFormat.parse("2021-01-21"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41aHzYSXZkL._SX380_BO1,204,203,200_.jpg", 
				10.0, 
				"Código limpo: Habilidades práticas do Agile Software", 
				"Robert C. Martin", 
				"Mesmo um código ruim pode funcionar. Mas se ele não for limpo, pode acabar com uma empresa de desenvolvimento. Perdem-se a cada ano horas incontáveis e recursos importantes devido a um código mal escrito. Mas não precisa ser assim.O renomado especialista em software, Robert C. Martin, apresenta um paradigma revolucionário com Código limpo: Habilidades Práticas do Agile Software. Martin se reuniu com seus colegas do Mentor Object para destilar suas melhores e mais ágeis práticas de limpar códigos “dinamicamente” em um livro que introduzirá gradualmente dentro de você os valores da habilidade de um profissional de softwares e lhe tornar um programador melhor –mas só se você praticar.Que tipo de trabalho você fará? Você lerá códigos aqui, muitos códigos. E você deverá descobrir o que está correto e errado nos códigos. E, o mais importante, você terá de reavaliar seus valores profissionais e seu comprometimento com o seu ofício.Código limpo está divido em três partes. Na primeira há diversos capítulos que descrevem os princípios, padrões e práticas para criar um código limpo.A segunda parte consiste em diversos casos de estudo de complexidade cada vez maior. Cada um é um exercício para limpar um código – transformar o código base que possui alguns problemas em um melhor e eficiente. A terceira parte é a compensação: um único capítulo com uma lista de heurísticas e “odores” reunidos durante a criação dos estudos de caso. O resultado será um conhecimento base que descreve a forma como pensamos quando criamos, lemos e limpamos um código.Após ler este livro os leitores saberão:✔ Como distinguir um código bom de um ruim✔ Como escrever códigos bons e como transformar um ruim em um bom✔ Como criar bons nomes, boas funções, bons objetos e boas classes✔ Como formatar o código para ter uma legibilidade máxima✔ Como implementar completamente o tratamento de erro sem obscurecer a lógica✔ Como aplicar testes de unidade e praticar o desenvolvimento dirigido a testesEste livro é essencial para qualquer desenvolvedor, engenheiro de software, gerente de projeto, líder de equipes ou analistas de sistemas com interesse em construir códigos melhores.",
				64.99, 11, "Informática", dateFormat.parse("2009-09-08"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/510jkCObwlL._SX348_BO1,204,203,200_.jpg", 
				10.0, 
				"Algoritmos e Programação com Exemplos em Pascal e C: Volume 23", 
				"Nina Edelweiss", 
				"Aprender programação não é uma tarefa simples. Requer um entendimento perfeito do problema, a análise de como solucioná-lo e a escolha da forma de implementação da solução. Algoritmos e programação com exemplos em Pascal e C apresenta o processo de construção de algoritmos e de programas, enfatizando as etapas de abstração, organização, análise e crítica na busca de soluções eficientes. Os elementos de um programa são introduzidos pouco a pouco ao longo do texto, inicialmente apresentados em pseudolinguagem e, em seguida, exemplificados nas linguagens de programação Pascal e C.",
				83.99, 12, "Informática", dateFormat.parse("2014-05-21"), false));

				books.add(new Book("https://m.media-amazon.com/images/I/41-0kLuynTL.jpg", 
				10.0, 
				"Matemática Discreta para Computação e Informática: Volume 16", 
				"Paulo Blauth Menezes", 
				"Os principais conceitos de matemática discreta em uma linguagem simples e acessível. Essa disciplina discreta é considerada pelos alunos especialmente difícil, mais do que a de cálculo, muitas vezes. Com isso em mente, o autor procurou dar ênfase aos aspectos didáticos, buscando texto simples e acessível, sem abrir mão dos aspectos matemáticos formais. A 4.ed. traz um capítulo novo sobre recursão, cuja abordagem foi desmembrada daquela sobre indução.",
				103.99, 52, "Informática", dateFormat.parse("2013-03-26"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51Z4tWTdQPL._SX385_BO1,204,203,200_.jpg", 
				10.0, 
				"Provas e concursos - Informática", 
				"João Paulo Colet", 
				"Revisado, ampliado e atualizado, essa é a nova edição do Série Provas & Concursos - Informática, agora com 1106 Questões Comentadas, Simulados Inéditos, Dicionário de Termos ampliado e agora com principais Teclas de Atalho do Windows e os Comandos do Linux.",
				38.99, 11, "Informática", dateFormat.parse("2019-08-26"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/5114ynRZxJL._SX348_BO1,204,203,200_.jpg", 
				10.0, 
				"Teoria da Computação - Máquinas Universais e Computabilidade: Volume 5", 
				"Tiarajú Asmuz Diverio", 
				"Aborda os principais aspectos relativos à teoria da computação de forma sistematizada e acessível.",
				86.99, 23, "Informática", dateFormat.parse("2011-02-23"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41FteHEV3UL._SX346_BO1,204,203,200_.jpg", 
				10.0, 
				"Introdução à Abstração de Dados: Volume 21", 
				"Daltro J. Nunes", 
				"Trata-se de um livro que ensina a especificar, ou modelar, soluções de problemas computacionais em alto nível de abstração e a desenvolver o raciocínio algorítmico. Para especificar soluções de problemas, o livro utiliza uma linguagem de programação funcional denominada MAuDE. Assim, a atividade de especificação ou modelagem da solução de problemas torna-se prazerosa e gratificante, pois as especificações são interpretáveis (executáveis) em qualquer computador, permitindo testá-las quanto a sua corretude.",
				108.99, 12, "Informática", dateFormat.parse("2021-01-21"), false));
				

				// BIOGRAFIA

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/519+lK+QruL._SX331_BO1,204,203,200_.jpg", 
				10.0, 
				"Minha vida, minha obra", 
				"Henry Ford", 
				"Uma história de vida inspiradora de um grande homem, cujos princípios o guiaram a se tornar uma das figuras mais marcantes da história industrial norte-americana. Este livro, embora publicado há quase cem anos, dá uma receita ainda atual e oportuna do que é preciso para qualquer empresário ter sucesso e deve ser lido por qualquer pessoa interessada no que é necessário para fazer parte do verdadeiro sonho americano, uma noção que hoje se mantém apenas por um fio nos Estados Unidos. Uma obra que vai além das técnicas para o sucesso trata-se de como fazer uma diferença verdadeiramente positiva para o indivíduo, os funcionários e o país como um todo.",
				13.99, 13, "Biografia", dateFormat.parse("2021-04-24"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41n4JacnNhL._SX339_BO1,204,203,200_.jpg", 
				10.0, 
				"Silvio Santos: A biografia", 
				"Marcia Batista", 
				"Seu nome é Senor Abravanel, mais conhecido como Silvio Santos. Sua característica mais marcante é a generosidade, eternizada no famoso bordão 'quem quer dinheiro?'. A boa índole de Silvio Santos, inclusive, é uma faceta de sua personalidade, a qual dez em cada dez de seus funcionários faz questão de ressaltar. Compreendendo os 86 anos da figura icônica que impactou a história e a rotina de milhões de brasileiros, este livro revela, inclusive por meio de relatos e documentos exclusivos, as conquistas e dificuldades que Silvio enfrentou para ser a unanimidade que é hoje: o lado família, o apresentador, o gestor de negócios, o descobridor de talentos, como se deram seus insights de empreendedor, além de inúmeras passagens impressionantes de uma trajetória riquíssima e encorajadora.",
				20.99, 15, "Biografia", dateFormat.parse("2020-01-31"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/511Df6TjJeS._SX339_BO1,204,203,200_.jpg", 
				10.0, 
				"Van Gogh", 
				"Steven Naifeh", 
				"Mestre da pintura do século XIX e profeta da arte moderna, Vincent Willem van Gogh (18531890) nasceu num vilarejo fronteiriço nos confins pantanosos do sul da Holanda, filho primogênito de um modesto pastor protestante. Solitário e impetuoso desde criança, o artista fracassou em todas as tentativas de se fixar numa profissão “respeitável”. Somente encontrou alívio parcial para seus anseios excruciantes na produção de milhares de desenhos e pinturas, ao mesmo tempo em que submergia na doença e na loucura. Steven Naifeh e Gregory White Smith apresentam nesta monumental reconstituição biográfica uma visão ao mesmo tempo erudita e apaixonada sobre o artista holandês. Os autores, responsáveis por uma biografia de Jackson Pollock (inédita no Brasil e inspiradora do filme Pollock, de 2000), esmiúçam o conturbado relacionamento com os pais, a amizade com o irmão Theo, a relação intensa com a religião, a errância entre diversas cidades, a vida sexual desregrada, o fracasso em vender suas obras, a amizade conturbada com Paul Gauguin, a loucura, a orelha mutilada - e sugere uma explicação surpreendente para o suposto suicídio.",
				83.99, 12, "Biografia", dateFormat.parse("2012-11-29"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41nb7Y5t6QL._SX331_BO1,204,203,200_.jpg", 
				10.0, 
				"Uma terra prometida", 
				"Barack Obama", 
				"No comovente e aguardado primeiro volume de suas memórias presidenciais, Barack Obama narra, nas próprias palavras, a história de sua odisseia improvável, desde quando era um jovem em busca de sua identidade até se tornar líder da maior democracia do mundo. Com detalhes surpreendentes, ele descreve sua formação política e os momentos marcantes do primeiro mandato de sua presidência histórica ― época de turbulências e transformações drásticas. Obama conduz os leitores através de uma jornada cativante, que inclui suas primeiras aspirações políticas, a vitória crucial nas primárias de Iowa, na qual se demonstrou a força do ativismo popular, e a noite decisiva de 4 de novembro de 2008, quando foi eleito 44º presidente dos Estados Unidos, o primeiro afro-americano a ocupar o cargo mais alto do país.",
				56.99, 11, "Biografia", dateFormat.parse("2020-11-17"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/41ZuoTrqboL._SX335_BO1,204,203,200_.jpg", 
				10.0, 
				"Diana: Sua verdadeira história", 
				"Andrew Morton", 
				"A morte trágica e inesperada da princesa Diana, em 1997, chocou o planeta ― e comove o público até hoje. Diana: Sua verdadeira história é a única biografia autorizada da princesa, escrita por Andrew Morton com a ajuda da própria Diana por meio de fitas gravadas no momento da pior crise de seu casamento e de sua depressão.",
				22.99, 8, "Biografia", dateFormat.parse("2013-10-21"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/410nkZsUG2L._SX331_BO1,204,203,200_.jpg", 
				10.0, 
				"A biografia de Novak Djokovic", 
				"Blaza Popovic", 
				"A vida de Novak Djokovic é uma verdadeira saga e um exemplo inspirador para praticantes e amantes de esportes em geral e do tênis, de todas as idades. Nascido e crescido na Sérvia, país que em anos recentes esteve envolvido em guerras, conflitos étnico-religiosos e crises político-econômicas, Djoko, como é carinhosamente chamado pelos fãs, possui uma trajetória de superação de obstáculos, extrema força de vontade e resiliência. Mas por que Djokovic se tornou um campeão? Quais desafios ele enfrentou para alcançar o topo do ranking mundial? Como pensa e age? Quais os seus valores e crenças? Afinal, quem é Novak Djokovic, dentro e fora das quadras? O livro traz respostas a todas essas perguntas ao contar a sua vida desde quando segurou uma raquete na infância, passando por sua adolescência e participação nos primeiros torneios internacionais, até a sua ascensão e permanência no topo do ranking mundial do tênis. Pela primeira vez, os bastidores da carreira e vida particular desse ídolo são revelados. Uma leitura emocionante, divertida e surpreendente!",
				104.99, 9, "Biografia", dateFormat.parse("2013-05-01"), false));

				books.add(new Book("https://images-na.ssl-images-amazon.com/images/I/51he3wIEopL._SX335_BO1,204,203,200_.jpg", 
				10.0, 
				"Lincoln", 
				"Doris Kearns Goodwin", 
				"Ao fazer uma análise do estilo de liderança de Abraham Lincoln, da maneira como ele entendia o comportamento humano e das alianças que construiu em seu governo, a premiada historiadora Doris Kearns Goodwin escreveu uma detalhada biografia de um dos mais emblemáticos presidentes norte-americanos. Um livro fundamental para o entendimento da Guerra Civil Americana e seus principais personagens. Além de esmiuçar o caráter e a carreira de Abraham Lincoln, a autora relata também a história dos homens extraordinários que foram seus rivais na indicação para a candidatura à presidência pelo Partido Republicano em 1860: o senador de Nova York William H. Seward, o governador de Ohio Salmon P. Chase, e o sábio e ilustre estadista do Missouri Edward Bates. Seward seria nomeado secretário de Estado, Chase, secretário do Tesouro, e Bates, secretário de Justiça.",
				41.99, 21, "Biografia", dateFormat.parse("2013-01-15"), false));
		return books;
	}
    
}
