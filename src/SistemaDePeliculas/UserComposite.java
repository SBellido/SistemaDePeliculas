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
public class UserComposite extends UserComponent {
	private ArrayList<UserComponent> groupUsers;
	private ArrayList<String> genres;

	public UserComposite() {
		super();
		this.groupUsers = new ArrayList<UserComponent>();
	}

	public void addToGroup(ArrayList<UserComponent> list) {
		if (this.getGroupUsers().isEmpty()) {
			this.getGroupUsers().addAll(list);
			System.out.println(
					"El primer usuario agregado al grupo " + this.getName() + " es \n" + list.get(0).getName() + "\n");
		} else {
			for (int j = 0; j < list.size(); j++) {
				for (int i = 0; i < groupUsers.size(); i++) {
					int isFinish = 0;
					if (list.get(j).getName().equals(groupUsers.get(i).getName())) {
						System.out.println(list.get(j).getName() + " ya existe en " + this.getName() + "\n");
						break;
					} else if (!list.get(j).getName().equals(groupUsers.get(i).getName())) {
						isFinish = i + 1;
						if (isFinish == groupUsers.size()) {
							this.getGroupUsers().add(list.get(j));
							System.out.println(list.get(j).getName() + " fue agregado con éxito al grupo "
									+ this.getName() + "\n");
							break;
						}
					}
				}
			}
		}
	}
	@Override
	public void watchMovie(Movie movie) {
		for (UserComponent user : this.groupUsers) {
			ArrayList<Movie> seenMovies = new ArrayList<Movie>();
			seenMovies = (ArrayList<Movie>) user.getSeenMovies();
			seenMovies.add(movie);
		}
		this.seenMovies.add(movie);
	}
	
	@Override
	public ArrayList<UserComponent> getUser() {
		return this.groupUsers;
	}

	@Override
	public String toString() {
		return "\nNombre del grupo " + this.getName()+ "\nCantidad de miembros: " + groupUsers.size()
				+ "\nPelículas vistas:" + this.seenMovies + "]";
	}

	@Override
	public ArrayList<String> getFavoriteGenres() {
		ArrayList<UserComponent> auxUser = new ArrayList<UserComponent>();
		auxUser = this.getUser();
		ArrayList<String> genres = new ArrayList<String>();
		ArrayList<String> favoriteGenres = new ArrayList<String>(genres);
		for (UserComponent user : auxUser) {
			genres =  user.getFavoriteGenres();
			favoriteGenres.addAll(genres);
		}
		return  favoriteGenres;
	}

	public Collection<UserComponent> getGroupUsers() {
		return groupUsers;
	}

}
