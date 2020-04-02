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


		/*carga datos de película 1*/
		upMovie.setTittle("Up : una aventura de altura\n");
		upMovie.setSynopsis("Carl Fredricksen es un vendedor de globos de 78 años de edad dispuesto a cumplir su\r\n" + 
				"sueño: atar miles de globos a su casa y volar a Sudamérica. Sin embargo, descubre\r\n" + 
				"demasiado tarde a un joven e inesperado polizón. Lo que en principio será recelo,\r\n" + 
				"acabará por tornarse simpatía hacia el muchacho mientras juntos pasan fascinantes\r\n" + 
				"aventuras en exóticos lugares.\n");
		upMovie.setReleaseYear(2009);	
		upMovie.addActor("Ed Asner");
		upMovie.addActor("Bob Peterson");
		upMovie.addActor("Jordan Nagai");
		upMovie.addDirector("Pete Docter");
		upMovie.addDirector("Bob Peterson");
		upMovie.addCategory("Infantil");
		upMovie.addCategory("Acción");
		upMovie.addCategory("Drama");

		/*carga datos de película 2*/
		simpsonMovie.setTittle("Los Simpson: la película\n");
		simpsonMovie.setSynopsis("La combinación de Homero (Dan Castellaneta), su nuevo puerco mascota, y un silo\r\n" + 
				"lleno de excremento podrían provocar un desastre que amenace no sólo a Springfield,\r\n" + 
				"sino al mundo entero. Una muchedumbre enojada llega a la casa de los Simpson,\r\n" + 
				"dividiendo a la familia. Con el destino de la Tierra en equilibrio, Homero se prepara\r\n" + 
				"para intentar redimirse con la intención de salvar al mundo y ganarse el perdón de\r\n" + 
				"Marge (Julie Kavner).\n");
		simpsonMovie.setReleaseYear(2007);	
		simpsonMovie.addActor("Dan Castellaneta");
		simpsonMovie.addActor("Harry Shearer");
		simpsonMovie.addActor("Julie Kavner");
		simpsonMovie.addDirector("David Silverman");
		simpsonMovie.addCategory("Romántico");
		simpsonMovie.addCategory("Musical");
		simpsonMovie.addCategory("Infantil");
		simpsonMovie.addCategory("Aventura");
		simpsonMovie.addCategory("Comedia");
		
		/*carga datos de película 3*/
		theIncrediblesMovie.setTittle("Los Increibles\n");
		theIncrediblesMovie.setSynopsis("Un súper héroe retirado lucha contra el aburrimiento en un suburbio y junto con su\r\n" + 
				"familia tiene la oportunidad de salvar al mundo\n");
		theIncrediblesMovie.addDirector("Brad Bird");
		theIncrediblesMovie.setReleaseYear(2004);	
		theIncrediblesMovie.addActor("Brad Bird");
		theIncrediblesMovie.addActor("Craig T");
		theIncrediblesMovie.addActor("Nelson");
		theIncrediblesMovie.addActor("Holly Hunter");
		theIncrediblesMovie.addCategory("Aventura");
		theIncrediblesMovie.addCategory("Infantil");
		theIncrediblesMovie.addCategory("Acción");
		
		/*carga datos de película 4*/
		theIncredibles2Movie.setTittle("Los Increibles 2\n");
		theIncredibles2Movie.setSynopsis("Helen entra en acción y debe luchar contra un cibercriminal que planea hipnotizar el\r\n" + 
				"mundo a través de las pantallas de las computadoras. Eso deja al Sr. Increíble con uno\r\n" + 
				"de sus mayores desafíos: quedarse en casa y cuidar de tres niños traviesos.\r\n" + 
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
		theIncredibles2Movie.addCategory("Acción");
		
		/*carga datos de pelíucula 5*/
		toyStoryMovie.setTittle("Toy Story\n");
		toyStoryMovie.setSynopsis("Lo mejor de la animación computarizada produce esta historia sobre juguetes que\r\n" + 
				"cobran vida cuando su dueño se ausenta.\n");
		toyStoryMovie.addDirector("John Lasseter");
		toyStoryMovie.setReleaseYear(1995);	
		toyStoryMovie.addActor("Tim Allen");
		toyStoryMovie.addActor("Tom Hanks");
		toyStoryMovie.addActor("Don Rickles");
		toyStoryMovie.addActor("Wallace Shawn");
		toyStoryMovie.addCategory("Infantil");
		toyStoryMovie.addCategory("Aventura");
		toyStoryMovie.addCategory("Acción");
	
		/*carga datos de película 6*/
		monsterIncMovie.setTittle("Monsters Inc.\n");
		monsterIncMovie.setSynopsis("Monsters, Incorporated es la fábrica de sustos más grande en el mundo de los\r\n" + 
				"monstruos y James P. Sullivan (John Goodman) es uno de sus mejores asustadores.\r\n" + 
				"Sullivan es un monstruo grande e intimidante de piel azul, grandes manchas color\r\n" + 
				"púrpura y cuernos. Su asistente, mejor amigo y compañero de cuarto es Mike\r\n" + 
				"Wazowski (Billy Crystal), un pequeño y alegre monstruo verde con un solo ojo. Boo\r\n" + 
				"(Mary Gibbs), una niña pequeña visita lugares en donde nunca antes había estado un\r\n" + 
				"ser humano.\n");
		monsterIncMovie.addDirector("Pete Docte");
		monsterIncMovie.setReleaseYear(2001);	
		monsterIncMovie.addActor("John Goodman");
		monsterIncMovie.addActor("Billy Crystal");
		monsterIncMovie.addActor("John Ratzenberger");
		monsterIncMovie.addCategory("Musical");
		monsterIncMovie.addCategory("Infantil");
		monsterIncMovie.addCategory("Aventura");
		monsterIncMovie.addCategory("Acción");

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

//		películas vistas por los usuarios y grupos de usuarios
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
		
		//puntuaciones obtenidas por película
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
