package SistemaDePeliculas;

import java.util.ArrayList;
import java.util.Collections;

public class MovieLibrary {
	private ArrayList<Movie> movieLibrary;
	private StrategyFavoriteGenres strategyFavoriteGenres;
	
	public MovieLibrary() {
		this.movieLibrary = new ArrayList<Movie>();
	}

	public ArrayList<Movie> recommendMovies(UserComponent user, int cant, StrategyFavoriteGenres favoriteGenres) {
		ArrayList<Movie> recommendMovies = new ArrayList<Movie>();
		ArrayList<Movie> seenMovies = user.getSeenMovies();
		this.orderMostValue(this.movieLibrary);
		for (Movie movie : this.movieLibrary) {
			if (!seenMovies.contains(movie)) {
				recommendMovies.add(movie);
			}
		}
		favoriteGenres.favoriteGenres(user, recommendMovies);
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

	public StrategyFavoriteGenres getStrategyFavoriteGenres() {
		return strategyFavoriteGenres;
	}

	public void setStrategyFavoriteGenres(StrategyFavoriteGenres strategyFavoriteGenres) {
		this.strategyFavoriteGenres = strategyFavoriteGenres;
	}

}