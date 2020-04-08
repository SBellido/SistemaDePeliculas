package SistemaDePeliculas;

import java.util.ArrayList;
import java.util.Collections;

public class MovieLibrary {
	private ArrayList<Movie> movieLibrary;
	private StrategyFavoriteGenres StrategyFavoriteGenres;
//	private atLeastOneFavoriteGenre leastOne;
//	private allFavoriteGenres all;
	
	public MovieLibrary() {
		this.movieLibrary = new ArrayList<Movie>();
//		this.setLeastOne(new atLeastOneFavoriteGenre());
//		this.setAll(new allFavoriteGenres());
	}

	public ArrayList<Movie> recommendMovies(UserComponent user, int cant) {
		ArrayList<Movie> recommendMovies = new ArrayList<Movie>();
		ArrayList<Movie> seenMovies = user.getSeenMovies();
		this.orderMostValue(this.movieLibrary);
		for (Movie movie : this.movieLibrary) {
			if (!seenMovies.contains(movie)) {
				recommendMovies.add(movie);
			}
		}
		StrategyFavoriteGenres.favoriteGenres(user, recommendMovies);
		this.theBestKAverages(recommendMovies, cant);
		return recommendMovies;
	}
	
	
	private ArrayList<Movie> theBestKAverages(ArrayList<Movie> seenMovies, int cant){
		for (Movie movie : this.movieLibrary) {
			if (seenMovies.size() < cant) {
				seenMovies.add(movie);
			} else {
				break;
			}	
		}
		return seenMovies;
	}
	
	private ArrayList<Movie> orderMostValue(ArrayList<Movie> seenMovies) {
		Collections.sort(seenMovies, new OrderByAverage());

		return movieLibrary;
	}

	public void addMovie(Movie movie) {
		movieLibrary.add(movie);
	}

	public ArrayList<Movie> getFilmLibrary() {
		return movieLibrary;
	}

	public void setFilmLibrary(ArrayList<Movie> filmLibrary) {
		this.movieLibrary = filmLibrary;
	}

//	public allFavoriteGenres getAll() {
//		return all;
//	}
//
//	public void setAll(allFavoriteGenres all) {
//		this.all = all;
//	}
//
//	public atLeastOneFavoriteGenre getLeastOne() {
//		return leastOne;
//	}
//
//	public void setLeastOne(atLeastOneFavoriteGenre leastOne) {
//		this.leastOne = leastOne;
//	}

}