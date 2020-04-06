/**
 * 
 */
package SistemaDePeliculas;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

/**
 * @author sebst
 *
 */
public abstract class UserComponent implements Comparable<UserComponent> {
	protected String name;
	protected int age;
	protected ArrayList<Movie> seenMovies;
	protected Set<String> genres;

	public UserComponent() {
		super();
		this.name = getName();
		this.seenMovies = new ArrayList<Movie>();
		this.genres = new HashSet<String>();

	}

	protected abstract ArrayList<UserComponent> getUser();
	public abstract String toString();
	public abstract Set<String> getFavoriteGenres();
	public abstract void watchMovie(Movie movie);
	
	public void addGenres(String genres) {
		for (int i = 0; i <= this.genres.size(); i++) {
			if(!this.genres.contains(genres)) {
				this.genres.add(genres);
				System.out.println("El género "+genres+" fue agregado a la lista de géneros favoritos de "+ this.getName());
				break;
			} else {
				System.out.println("El género "+genres+" ya existe en la lista de "+this.getName());
				break;
			}
		}
	}
	
	public int compareTo(UserComponent user) {
		if (this.getName().equals(user.getName())) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public void seenMovies() {
		System.out.println("\nPelículas vistas por " + this.getName());
		for (Movie movie : this.seenMovies) {
			String title = movie.getTitle();
			System.out.print("- "+title);
			}
	}

	public void valueMovie(Movie movie, int value) {
		if (this.seenMovies.contains(movie) && (value > 0 && value <= 5)) {
			movie.getValuations().put(this.getName(), value);
			movie.getAverage();
			System.out.print(this.getName() + ", su valuación de " + value + " fue cargada con éxito para el film "
					+ movie.getTitle());
		} else {
			System.out.println(this.getName() + " no ha visto " + movie.getTitle()
					+ " o ha cargado mal su valoración. La valoración debe ser 1, 2, 3, 4 o 5\n");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Movie> getSeenMovies() {
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
