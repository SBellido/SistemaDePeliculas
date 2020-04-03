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
	public ArrayList<UserComponent> getUser() {
		return this.groupUsers;
	}

	public Collection<UserComponent> getGroupUsers() {
		return groupUsers;
	}

	@Override
	public String toString() {
		return "\nNombre del grupo " + this.getName()+ "\nCantidad de miembros: " + groupUsers.size()
				+ "\nPelículas vistas:" + this.seenMovies + "]";
	}

	@Override
	public ArrayList<String> getFavoriteGenres() {
		System.out.println("Géneros favoritos del grupo "+this.getName());
		ArrayList<UserComponent> auxUser = new ArrayList<UserComponent>();
		auxUser = this.getUser();
		ArrayList<String> genres = new ArrayList<String>();
		Set<String> favoriteGenres = new HashSet<String>(genres);
		for (UserComponent user : auxUser) {
			genres = user.getFavoriteGenres();
			favoriteGenres.addAll(genres);
		}
		System.out.println(favoriteGenres);

//			ArrayList<UserComponent> auxUser = new ArrayList<UserComponent>();
//			System.out.println(this.groupUsers.get(i));
//			for (int j = 0; j <= auxGenList.size(); j++) {			
//				if (!auxGenList.get(j).toString().equals(this.genres.get(i).toString())) {
//					isFinish = i + 1;
//					if (isFinish == groupUsers.size()) {
//						
////					}
//					this.genres.addAll(auxGenList);
//					System.out.println("El genero "+ auxGenList);
//				}
//			}
		
		return this.genres;
	}
}
