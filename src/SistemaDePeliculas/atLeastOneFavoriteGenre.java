package SistemaDePeliculas;

import java.util.ArrayList;

public class atLeastOneFavoriteGenre implements StrategyFavoriteGenres {

	public atLeastOneFavoriteGenre() {

	}

	@Override
	public ArrayList<Movie> favoriteGenres(UserComponent user, ArrayList<Movie> movieLibrary) {
		ArrayList<Movie> matchMovies = new ArrayList<Movie>();
		ArrayList<String> categories = new ArrayList<String>();
		ArrayList<String> favoriteGenresUser = new ArrayList<String>();
		favoriteGenresUser = user.getFavoriteGenres();
		for (Movie movie : movieLibrary) {
			categories = movie.getCategories();
			if(compareCategories(categories,favoriteGenresUser)) {
				
			}
			
			matchMovies.add(movie);				
			}
 		
		return matchMovies;
	}

	private boolean compareCategories(ArrayList<String> categories, ArrayList<String> favoriteGenres) {
		for (String cat : categories) {
			for (String favoriteGen : favoriteGenres) {
				if(cat.equals(favoriteGen)) {
					return true;
				} else {
					return false;
				}
			}
		}	
		return true;
	}
}
