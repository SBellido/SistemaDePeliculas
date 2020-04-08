package SistemaDePeliculas;

import java.util.ArrayList;

public class allFavoriteGenres implements StrategyFavoriteGenres {

	public allFavoriteGenres() {

	}
	@Override
	public ArrayList<Movie> favoriteGenres(UserComponent user, ArrayList<Movie> movieLibrary) {
		ArrayList<Movie> matchCategories = new ArrayList<Movie>();
		ArrayList<String> categorie = new ArrayList<String>();
		ArrayList<String> favoriteGenresUser = new ArrayList<String>();
		favoriteGenresUser = user.getFavoriteGenres();
		for (Movie movie : movieLibrary) {
			categorie = movie.getCategories();
			if(categorie.containsAll(favoriteGenresUser)) {
				matchCategories.add(movie);				
			}
 		}
		return matchCategories;
	}
	
}
