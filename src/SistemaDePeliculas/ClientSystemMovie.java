package SistemaDePeliculas;

/**
 * @author sebst
 *
 */
public class ClientSystemMovie {

	public static void main(String[] args) {
		/* instancia de clases */
		MovieLibrary movieLibrary = new MovieLibrary();

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
		homer.addGenres("Musical");
		homer.addGenres("Infantil");
		homer.addGenres("Acción");
//		System.out.println(homer.getFavoriteGenres());

		marge.setName("Marge");
		marge.setAge(40);
		marge.addGenres("Infantil");
		marge.addGenres("Romántico");
		marge.addGenres("Musical");
		marge.addGenres("Aventura");
//		System.out.println(marge.getFavoriteGenres());

		lisa.setName("Lisa");
		lisa.setAge(10);
		lisa.addGenres("Romántico");
		lisa.addGenres("Musical");
		lisa.addGenres("Infantil");
		lisa.addGenres("Aventura");
//		System.out.println(lisa.getFavoriteGenres());

		bart.setName("Bart");
		bart.setAge(8);
		bart.addGenres("Musical");
		bart.addGenres("Infantil");
		bart.addGenres("Aventura");
		bart.addGenres("Acción");
//		System.out.println(bart.getFavoriteGenres());

		maggie.setName("Maggie");
		maggie.setAge(2);
		maggie.addGenres("Musical");
		maggie.addGenres("Infantil");
		maggie.addGenres("Aventura");
//		System.out.println(maggie.getFavoriteGenres());

		simpsonBrothers.setName("Hermanos Simpson");

		simpsonFamily.setName("Familia Simpson");

		/* carga datos de película 1 */
		upMovie.setTittle("Up : una aventura de altura\n");
		upMovie.setSynopsis("Carl Fredricksen es un vendedor de globos de 78 años de edad dispuesto a cumplir su\r\n"
				+ "sueño: atar miles de globos a su casa y volar a Sudamérica. Sin embargo, descubre\r\n"
				+ "demasiado tarde a un joven e inesperado polizón. Lo que en principio será recelo,\r\n"
				+ "acabará por tornarse simpatía hacia el muchacho mientras juntos pasan fascinantes\r\n"
				+ "aventuras en exóticos lugares.\n");
		upMovie.setReleaseYear(2009);
		upMovie.addActor("Ed Asner");
		upMovie.addActor("Bob Peterson");
		upMovie.addActor("Jordan Nagai");
		upMovie.addDirector("Pete Docter");
		upMovie.addDirector("Bob Peterson");
		upMovie.addCategory("Infantil");
		upMovie.addCategory("Acción");
		upMovie.addCategory("Drama");

		/* carga datos de película 2 */
		simpsonMovie.setTittle("Los Simpson: la película\n");
		simpsonMovie.setSynopsis("La combinación de Homero (Dan Castellaneta), su nuevo puerco mascota, y un silo\r\n"
				+ "lleno de excremento podrían provocar un desastre que amenace no sólo a Springfield,\r\n"
				+ "sino al mundo entero. Una muchedumbre enojada llega a la casa de los Simpson,\r\n"
				+ "dividiendo a la familia. Con el destino de la Tierra en equilibrio, Homero se prepara\r\n"
				+ "para intentar redimirse con la intención de salvar al mundo y ganarse el perdón de\r\n"
				+ "Marge (Julie Kavner).\n");
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

		/* carga datos de película 3 */
		theIncrediblesMovie.setTittle("Los Increibles\n");
		theIncrediblesMovie
				.setSynopsis("Un súper héroe retirado lucha contra el aburrimiento en un suburbio y junto con su\r\n"
						+ "familia tiene la oportunidad de salvar al mundo\n");
		theIncrediblesMovie.addDirector("Brad Bird");
		theIncrediblesMovie.setReleaseYear(2004);
		theIncrediblesMovie.addActor("Brad Bird");
		theIncrediblesMovie.addActor("Craig T");
		theIncrediblesMovie.addActor("Nelson");
		theIncrediblesMovie.addActor("Holly Hunter");
		theIncrediblesMovie.addCategory("Aventura");
		theIncrediblesMovie.addCategory("Infantil");
		theIncrediblesMovie.addCategory("Acción");

		/* carga datos de película 4 */
		theIncredibles2Movie.setTittle("Los Increibles 2\n");
		theIncredibles2Movie
				.setSynopsis("Helen entra en acción y debe luchar contra un cibercriminal que planea hipnotizar el\r\n"
						+ "mundo a través de las pantallas de las computadoras. Eso deja al Sr. Increíble con uno\r\n"
						+ "de sus mayores desafíos: quedarse en casa y cuidar de tres niños traviesos.\r\n" + "\n");
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

		/* carga datos de pelíucula 5 */
		toyStoryMovie.setTittle("Toy Story\n");
		toyStoryMovie.setSynopsis("Lo mejor de la animación computarizada produce esta historia sobre juguetes que\r\n"
				+ "cobran vida cuando su dueño se ausenta.\n");
		toyStoryMovie.addDirector("John Lasseter");
		toyStoryMovie.setReleaseYear(1995);
		toyStoryMovie.addActor("Tim Allen");
		toyStoryMovie.addActor("Tom Hanks");
		toyStoryMovie.addActor("Don Rickles");
		toyStoryMovie.addActor("Wallace Shawn");
		toyStoryMovie.addCategory("Infantil");
		toyStoryMovie.addCategory("Aventura");
		toyStoryMovie.addCategory("Acción");

		/* carga datos de película 6 */
		monsterIncMovie.setTittle("Monsters Inc.\n");
		monsterIncMovie.setSynopsis("Monsters, Incorporated es la fábrica de sustos más grande en el mundo de los\r\n"
				+ "monstruos y James P. Sullivan (John Goodman) es uno de sus mejores asustadores.\r\n"
				+ "Sullivan es un monstruo grande e intimidante de piel azul, grandes manchas color\r\n"
				+ "púrpura y cuernos. Su asistente, mejor amigo y compañero de cuarto es Mike\r\n"
				+ "Wazowski (Billy Crystal), un pequeño y alegre monstruo verde con un solo ojo. Boo\r\n"
				+ "(Mary Gibbs), una niña pequeña visita lugares en donde nunca antes había estado un\r\n"
				+ "ser humano.\n");
		monsterIncMovie.addDirector("Pete Docte");
		monsterIncMovie.setReleaseYear(2001);
		monsterIncMovie.addActor("John Goodman");
		monsterIncMovie.addActor("Billy Crystal");
		monsterIncMovie.addActor("John Ratzenberger");
		monsterIncMovie.addCategory("Musical");
		monsterIncMovie.addCategory("Infantil");
		monsterIncMovie.addCategory("Aventura");
		monsterIncMovie.addCategory("Acción");

//		agrega películas a la librería
		movieLibrary.addMovie(upMovie);
		movieLibrary.addMovie(simpsonMovie);
		movieLibrary.addMovie(monsterIncMovie);
		movieLibrary.addMovie(theIncrediblesMovie);
		movieLibrary.addMovie(theIncredibles2Movie);
		movieLibrary.addMovie(toyStoryMovie);

//		carga agrega usuarios a un grupo
		simpsonBrothers.addToGroup(lisa.getUser());
		simpsonBrothers.addToGroup(maggie.getUser());
		simpsonBrothers.addToGroup(bart.getUser());
		simpsonFamily.addToGroup(marge.getUser());
		simpsonFamily.addToGroup(homer.getUser());
		simpsonFamily.addToGroup(simpsonBrothers.getUser());
		System.out.println(simpsonFamily.toString());

//		películas vistas por los usuarios y grupos de usuarios
		marge.watchMovie(theIncrediblesMovie);
		marge.watchMovie(theIncredibles2Movie);
		marge.watchMovie(toyStoryMovie);
		lisa.watchMovie(theIncrediblesMovie);
		lisa.watchMovie(monsterIncMovie);
		lisa.watchMovie(simpsonMovie);
		homer.watchMovie(simpsonMovie);
		homer.watchMovie(upMovie);
		homer.watchMovie(theIncrediblesMovie);
		homer.watchMovie(theIncredibles2Movie);

		bart.watchMovie(theIncrediblesMovie);
		bart.watchMovie(toyStoryMovie);
		maggie.watchMovie(theIncredibles2Movie);
		maggie.watchMovie(toyStoryMovie);
		simpsonBrothers.watchMovie(upMovie);
		simpsonBrothers.watchMovie(toyStoryMovie);
		simpsonBrothers.watchMovie(theIncredibles2Movie);

//		simpsonFamily.watchMovie(toyStoryMovie);
//		simpsonFamily.seenMovies();
//		lisa.seenMovies();
//		maggie.seenMovies();

//		puntuaciones dadas por los usuarios	
//		simpsonFamily.valueMovie(toyStoryMovie, 4);
		simpsonBrothers.valueMovie(upMovie, 2);
		lisa.valueMovie(theIncrediblesMovie, 4);
		lisa.valueMovie(simpsonMovie, 5);
		lisa.valueMovie(monsterIncMovie, 4);

		bart.valueMovie(theIncrediblesMovie, 4);
		homer.valueMovie(theIncrediblesMovie, 4);
		marge.valueMovie(theIncredibles2Movie, 5);
		maggie.valueMovie(toyStoryMovie, 1);
		// puntuaciones obtenidas por película
		theIncrediblesMovie.printValuations();

//		generos favotiros de los grupos
		System.out.println("\nGéneros favoritos de " + homer.getName() + " son\n" + homer.getFavoriteGenres());

//		listar peliculas vistas por cada usuario
		marge.seenMovies();
		bart.seenMovies();
		lisa.seenMovies();
		maggie.seenMovies();
		simpsonBrothers.seenMovies();

		System.out.println("\nPelícula: " + upMovie.getTitle() + "Valuaciones: " + upMovie.getValuations());
		System.out.println("\nPelícula: " + upMovie.getTitle() + "Promedio: " + upMovie.getAverage());

		System.out.println("\nPelícula: " + theIncrediblesMovie.getTitle() + "Valuaciones: "
				+ theIncrediblesMovie.getValuations());
		System.out.println(
				"\nPelícula: " + theIncrediblesMovie.getTitle() + "Promedio: " + theIncrediblesMovie.getAverage());

		System.out.println("\nPelícula: " + theIncredibles2Movie.getTitle() + "Valuaciones: "
				+ theIncredibles2Movie.getValuations());
		System.out.println(
				"\nPelícula: " + theIncredibles2Movie.getTitle() + "Promedio: " + theIncredibles2Movie.getAverage());

		System.out.println("\nPelícula: " + toyStoryMovie.getTitle() + "Valuaciones: " + toyStoryMovie.getValuations());
		System.out.println("\nPelícula: " + toyStoryMovie.getTitle() + "Promedio: " + toyStoryMovie.getAverage());

		System.out.println("\nPelícula: " + simpsonMovie.getTitle() + "Valuaciones: " + simpsonMovie.getValuations());
		System.out.println("\nPelícula: " + simpsonMovie.getTitle() + "Valuaciones: " + simpsonMovie.getAverage());

//		System.out.println("\nGéneros favoritos de "+maggie.getName()+" son\n"+maggie.getFavoriteGenres());
//		System.out.println("\nGéneros favoritos de "+simpsonFamily.getName()+" son\n"+simpsonFamily.getFavoriteGenres());
//		System.out.println("\nTítulo Película: "+toyStoryMovie.getTitle()+"Promedio valuaciones: "+toyStoryMovie.getAverage());
//		System.out.println("\nLas películas cargadas son \n"+movieLibrary.getFilmLibrary());
//		System.out.println("Películas recomendadas para " + 
//				simpsonBrothers.getName() + " son "+ 
//				movieLibrary.recommendMovies(simpsonBrothers, 4));
		
		homer.seenMovies();
		System.out.println("Recomendaciones para  "+homer.getName()+" "+movieLibrary.recommendMovies(homer,3));
		simpsonBrothers.seenMovies();
		System.out.println("Recomendaciones para  "+simpsonBrothers.getName()+" "+movieLibrary.recommendMovies(simpsonBrothers,3));

	}

}
