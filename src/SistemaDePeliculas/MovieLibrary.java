package SistemaDePeliculas;

import java.util.HashSet;
import java.util.Set;

public class MovieLibrary {
	Set<Movie> movieLibrary;

	public MovieLibrary() {
		this.movieLibrary = new HashSet<Movie>();
	}

	public Movie mostValue() {
		double bestAverage = 0;
		Movie moreValue = new Movie();
		for (Movie movie : movieLibrary) {
			if (movie.getAverage() >= bestAverage) {
				bestAverage = movie.getAverage();
				moreValue = movie;
			}
		}
		return moreValue;
	}

	public void addMovie(Movie movie) {
		movieLibrary.add(movie);
	}

	public Set<Movie> getFilmLibrary() {
		return movieLibrary;
	}

	public void setFilmLibrary(Set<Movie> filmLibrary) {
		this.movieLibrary = filmLibrary;
	}
}