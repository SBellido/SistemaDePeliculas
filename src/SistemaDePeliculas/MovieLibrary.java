package SistemaDePeliculas;

import java.util.ArrayList;
import java.util.Collections;

public class MovieLibrary {
	private ArrayList<Movie> movieLibrary;

	public MovieLibrary() {
		this.movieLibrary = new ArrayList<Movie>();
	}

	public ArrayList<Movie> recommendMovies(UserComponent user, int cant) {
		ArrayList<Movie> recommendMovies = new ArrayList<Movie>();
		ArrayList<Movie> seenMovies = user.getSeenMovies();
		this.orderMostValue(seenMovies, cant);
		for (Movie movie : movieLibrary) {
			if (!seenMovies.contains(movie)) {
				recommendMovies.add(movie);
			}
		}
		return recommendMovies;
	}

	private ArrayList<Movie> orderMostValue(ArrayList<Movie> listMoreValue, int cant) {
		Collections.sort(this.movieLibrary, new OrderByAverage());
		for (Movie movie : this.movieLibrary) {
			if (listMoreValue.size() < cant) {
				listMoreValue.add(movie);
			} else {
				break;
			}
		}
		return listMoreValue;
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

}