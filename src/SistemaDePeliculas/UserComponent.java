/**
 * 
 */
package SistemaDePeliculas;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sebst
 *
 */
public abstract class UserComponent implements Comparable<UserComponent> {
	protected String name;
	protected int age;
	protected ArrayList<Movie> seenMovies;
	protected ArrayList<String> genres;
	
	public UserComponent() {
		super();
		this.name = getName();
		this.seenMovies = new ArrayList<Movie>();
		this.genres = new ArrayList<String>();
	}

	protected abstract ArrayList<UserComponent> getUser();
	
	protected abstract ArrayList<String> GetfavoriteGenres();
	protected abstract void addGenres(String gender);
	
	public int compareTo(UserComponent user) {
		if (this.getName().equals(user.getName())) {
			return 0;
		} else {
			return 1;
		}
	}

	public void seenMovies() {
		System.out.println("\nPelículas vistas por " + this.getName());
		Iterator<Movie> iteradorMovies = seenMovies.iterator();
		if (iteradorMovies.hasNext()) {
			System.out.println(this.getSeenMovies());
		}
	}

	public void valueMovie(Movie movie, int value) {
		if (this.seenMovies.contains(movie) && (value > 0 && value <= 5)) {
			movie.getValuations().put(this.getName(), value);
			movie.getAverage();
			System.out.print(this.getName() + ", su valuación de " + value + " fue cargada con éxito para el film "
					+ movie.getTittle());
		} else {
			System.out.println(this.getName() + " no ha visto " + movie.getTittle()
					+ " o ha cargado mal su valoración. La valoración debe ser 1, 2, 3, 4 o 5\n");
		}
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSeenMovies(List<Movie> seenMovies) {
		this.seenMovies = seenMovies;
	}

	public void watchMovie(Movie movie) {
		this.seenMovies.add(movie);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Movie> getSeenMovies() {
		return seenMovies;
	}

	public void setSeenMovies(ArrayList<Movie> seenMovies) {
		this.seenMovies = seenMovies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((seenMovies == null) ? 0 : seenMovies.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserComponent other = (UserComponent) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (seenMovies == null) {
			if (other.seenMovies != null)
				return false;
		} else if (!seenMovies.equals(other.seenMovies))
			return false;
		return true;
	}



}
