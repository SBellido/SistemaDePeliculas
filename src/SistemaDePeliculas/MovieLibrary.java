package SistemaDePeliculas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieLibrary {
	ArrayList<Movie> movieLibrary;

	public MovieLibrary() {
		this.movieLibrary = new ArrayList<Movie>();
	}

	
	
	public ArrayList<Movie> recommendMovies(UserComponent user) {
		ArrayList<Movie> recommendMovies = new ArrayList<Movie>();
		ArrayList<Movie> seenMovies = user.getSeenMovies();
		for (Movie movie : movieLibrary) {
			if (!seenMovies.contains(movie)) {
				recommendMovies.add(movie);
			}
			Collections.sort(recommendMovies, new OrderByAverage());
//			if()
//			recommendMovies.sort(Collections.reverseOrder());
		}
		return recommendMovies;
	}
	
	
//	public List<Movie> mostValue(int cant) {
//		double bestAverage = 0;
//		List<Movie> listMoreValue = new ArrayList<Movie>();
//		Movie moreValue = new Movie();
//		for (Movie movie : this.movieLibrary) {
//				if(listMoreValue.size() < cant) {
//					listMoreValue.add(movie);
//				}
//			}
//		
//		return listMoreValue;
//	}
	
	public List<Movie> mostValue(int cant) {
		double bestAverage = 0;
		List<Movie> listMoreValue = new ArrayList<Movie>();
		Movie moreValue = new Movie();
		for (Movie movie : this.movieLibrary) {
			double auxAverage = movie.getAverage();
			if (auxAverage >= bestAverage) {
				bestAverage = movie.getAverage();
				moreValue = movie;
				if(listMoreValue.size() < cant) {
//					this.compare(movie, moreValue);
					listMoreValue.add(moreValue);
				}
			}
		}
		return listMoreValue;
	}
//	public List<Movie> mostValue(int cant) {
//		List<Movie> listMoreValue = new ArrayList<Movie>();
//		Movie moreValue = new Movie();
//		for (Movie movie : this.movieLibrary) {
//			int value = movie.compareTo(moreValue);
//			if (listMoreValue.size() < cant) {
//				moreValue = movie;
//				if (value == 1 || value == 0) {
//					listMoreValue.add(movie);
//				}
//			}
//		}
//		return listMoreValue;
//	}

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