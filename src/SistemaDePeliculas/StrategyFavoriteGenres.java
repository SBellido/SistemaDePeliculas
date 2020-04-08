package SistemaDePeliculas;

import java.util.ArrayList;

public interface StrategyFavoriteGenres {
	
	public ArrayList<Movie> favoriteGenres(UserComponent user, ArrayList<Movie> movieLibrary);

}
