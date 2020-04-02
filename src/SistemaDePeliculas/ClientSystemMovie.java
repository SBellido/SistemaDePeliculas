package SistemaDePeliculas;

/**
 * @author sebst
 *
 */
public class ClientSystemMovie {

	public static void main(String[] args) {
		/*instancia de clases*/
		UserComponent homer = new UserSingle();
		UserComponent marge = new UserSingle();
		UserComponent lisa = new UserSingle();
		UserComponent bart = new UserSingle();
		UserComponent maggie = new UserSingle();
		UserComposite simpsonBrothers = new UserComposite();
		UserComposite simpsonFamily = new UserComposite();
		
		Movie upMovie = new Movie();	
		Movie simpsonMovie = new Movie();
		Movie theIncrediblesMovie = new Movie();
		Movie theIncredibles2Movie = new Movie();
		Movie toyStoryMovie = new Movie();
		Movie monsterIncMovie = new Movie();	
		
		// carga datos de usuarios
		homer.setName("Homero");
		homer.setAge(45);
		marge.setName("Marge");
		lisa.setName("Lisa");
		bart.setName("Bart");
		maggie.setName("Maggie");
		simpsonBrothers.setName("Hermanos Simpson");
		simpsonFamily.setName("Familia Simpson");


		/*carga datos de pel�cula 1*/
		upMovie.setTittle("Up : una aventura de altura\n");
		upMovie.setSynopsis("Carl Fredricksen es un vendedor de globos de 78 a�os de edad dispuesto a cumplir su\r\n" + 
				"sue�o: atar miles de globos a su casa y volar a Sudam�rica. Sin embargo, descubre\r\n" + 
				"demasiado tarde a un joven e inesperado poliz�n. Lo que en principio ser� recelo,\r\n" + 
				"acabar� por tornarse simpat�a hacia el muchacho mientras juntos pasan fascinantes\r\n" + 
				"aventuras en ex�ticos lugares.\n");
		upMovie.setReleaseYear(2009);	
		upMovie.addActor("Ed Asner");
		upMovie.addActor("Bob Peterson");
		upMovie.addActor("Jordan Nagai");
		upMovie.addDirector("Pete Docter");
		upMovie.addDirector("Bob Peterson");
		upMovie.addCategory("Infantil");
		upMovie.addCategory("Acci�n");
		upMovie.addCategory("Drama");

		/*carga datos de pel�cula 2*/
		simpsonMovie.setTittle("Los Simpson: la pel�cula\n");
		simpsonMovie.setSynopsis("La combinaci�n de Homero (Dan Castellaneta), su nuevo puerco mascota, y un silo\r\n" + 
				"lleno de excremento podr�an provocar un desastre que amenace no s�lo a Springfield,\r\n" + 
				"sino al mundo entero. Una muchedumbre enojada llega a la casa de los Simpson,\r\n" + 
				"dividiendo a la familia. Con el destino de la Tierra en equilibrio, Homero se prepara\r\n" + 
				"para intentar redimirse con la intenci�n de salvar al mundo y ganarse el perd�n de\r\n" + 
				"Marge (Julie Kavner).\n");
		simpsonMovie.setReleaseYear(2007);	
		simpsonMovie.addActor("Dan Castellaneta");
		simpsonMovie.addActor("Harry Shearer");
		simpsonMovie.addActor("Julie Kavner");
		simpsonMovie.addDirector("David Silverman");
		simpsonMovie.addCategory("Rom�ntico");
		simpsonMovie.addCategory("Musical");
		simpsonMovie.addCategory("Infantil");
		simpsonMovie.addCategory("Aventura");
		simpsonMovie.addCategory("Comedia");
		
		/*carga datos de pel�cula 3*/
		theIncrediblesMovie.setTittle("Los Increibles\n");
		theIncrediblesMovie.setSynopsis("Un s�per h�roe retirado lucha contra el aburrimiento en un suburbio y junto con su\r\n" + 
				"familia tiene la oportunidad de salvar al mundo\n");
		theIncrediblesMovie.addDirector("Brad Bird");
		theIncrediblesMovie.setReleaseYear(2004);	
		theIncrediblesMovie.addActor("Brad Bird");
		theIncrediblesMovie.addActor("Craig T");
		theIncrediblesMovie.addActor("Nelson");
		theIncrediblesMovie.addActor("Holly Hunter");
		theIncrediblesMovie.addCategory("Aventura");
		theIncrediblesMovie.addCategory("Infantil");
		theIncrediblesMovie.addCategory("Acci�n");
		
		/*carga datos de pel�cula 4*/
		theIncredibles2Movie.setTittle("Los Increibles 2\n");
		theIncredibles2Movie.setSynopsis("Helen entra en acci�n y debe luchar contra un cibercriminal que planea hipnotizar el\r\n" + 
				"mundo a trav�s de las pantallas de las computadoras. Eso deja al Sr. Incre�ble con uno\r\n" + 
				"de sus mayores desaf�os: quedarse en casa y cuidar de tres ni�os traviesos.\r\n" + 
				"\n");
		theIncredibles2Movie.addDirector("Brad Bird");
		theIncredibles2Movie.setReleaseYear(2018);	
		theIncredibles2Movie.addActor("Brad Bird");
		theIncredibles2Movie.addActor("Craig T");
		theIncredibles2Movie.addActor("Nelson");
		theIncredibles2Movie.addActor("Holly Hunter");
		theIncredibles2Movie.addCategory("Musical");
		theIncredibles2Movie.addCategory("Aventura");
		theIncredibles2Movie.addCategory("Infantil");
		theIncredibles2Movie.addCategory("Acci�n");
		
		/*carga datos de pel�ucula 5*/
		toyStoryMovie.setTittle("Toy Story\n");
		toyStoryMovie.setSynopsis("Lo mejor de la animaci�n computarizada produce esta historia sobre juguetes que\r\n" + 
				"cobran vida cuando su due�o se ausenta.\n");
		toyStoryMovie.addDirector("John Lasseter");
		toyStoryMovie.setReleaseYear(1995);	
		toyStoryMovie.addActor("Tim Allen");
		toyStoryMovie.addActor("Tom Hanks");
		toyStoryMovie.addActor("Don Rickles");
		toyStoryMovie.addActor("Wallace Shawn");
		toyStoryMovie.addCategory("Infantil");
		toyStoryMovie.addCategory("Aventura");
		toyStoryMovie.addCategory("Acci�n");
	
		/*carga datos de pel�cula 6*/
		monsterIncMovie.setTittle("Monsters Inc.\n");
		monsterIncMovie.setSynopsis("Monsters, Incorporated es la f�brica de sustos m�s grande en el mundo de los\r\n" + 
				"monstruos y James P. Sullivan (John Goodman) es uno de sus mejores asustadores.\r\n" + 
				"Sullivan es un monstruo grande e intimidante de piel azul, grandes manchas color\r\n" + 
				"p�rpura y cuernos. Su asistente, mejor amigo y compa�ero de cuarto es Mike\r\n" + 
				"Wazowski (Billy Crystal), un peque�o y alegre monstruo verde con un solo ojo. Boo\r\n" + 
				"(Mary Gibbs), una ni�a peque�a visita lugares en donde nunca antes hab�a estado un\r\n" + 
				"ser humano.\n");
		monsterIncMovie.addDirector("Pete Docte");
		monsterIncMovie.setReleaseYear(2001);	
		monsterIncMovie.addActor("John Goodman");
		monsterIncMovie.addActor("Billy Crystal");
		monsterIncMovie.addActor("John Ratzenberger");
		monsterIncMovie.addCategory("Musical");
		monsterIncMovie.addCategory("Infantil");
		monsterIncMovie.addCategory("Aventura");
		monsterIncMovie.addCategory("Acci�n");

		//carga agrega usuarios a un grupo
		simpsonBrothers.addToGroup(lisa.getUser());
		simpsonBrothers.addToGroup(maggie.getUser());	
		simpsonBrothers.addToGroup(bart.getUser());
		simpsonFamily.addToGroup(marge.getUser());
		simpsonFamily.addToGroup(simpsonBrothers.getUser());
		simpsonFamily.addToGroup(lisa.getUser());
		simpsonFamily.addToGroup(maggie.getUser());	
		simpsonFamily.addToGroup(bart.getUser());

		System.out.println(simpsonFamily.toString());
//		System.out.println(homer.getGenres());
//		System.out.println(homer.toString());

//		pel�culas vistas por los usuarios y grupos de usuarios
//		marge.watchMovie(theIncrediblesMovie);
//		lisa.watchMovie(theIncrediblesMovie);
//		bart.watchMovie(theIncrediblesMovie);
//		maggie.watchMovie(theIncredibles2Movie);
//		maggie.watchMovie(toyStoryMovie);
//		simpsonFamily.watchMovie(toyStoryMovie);
//		System.out.println(toyStoryMovie.toString());
//		simpsonFamily.seenMovies();
//		System.out.println(movieSystem.toString());

		//puntuaciones dadas por los usuarios	
//		simpsonBrothers.valueMovie(theIncrediblesMovie, 5);
//		bart.valueMovie(theIncrediblesMovie, 2);
//		homer.valueMovie(theIncrediblesMovie, 4);
//		marge.valueMovie(theIncrediblesMovie,2);
//		maggie.valueMovie(toyStoryMovie, 1);
//		simpsonBrothers.watchMovie(toyStoryMovie);
//		simpsonBrothers.seenMovies();
//		maggie.seenMovies();
		
		//puntuaciones obtenidas por pel�cula
//		//theIncrediblesMovie.printValuations();
//		
//		//datos de los usuarios registrados
//		System.out.println(homer.toString());
//		System.out.println(marge.toString());
//		System.out.println(lisa.toString());
//		System.out.println(bart.toString());
//		System.out.println(maggie.toString());
		
//		listar peliculas vistas por cada usuario
//		System.out.println(marge.getSeenMovies());

	}

}
