/**
 * 
 */
package SistemaDePeliculas;

import java.util.Collection;
import java.util.ArrayList;

/**
 * @author sebst
 *
 */
public class UserComposite extends UserComponent {
	private ArrayList<UserComponent> groupUsers;

	public UserComposite() {
		super();
		this.groupUsers = new ArrayList<UserComponent>();
	}
	
	@Override
	 public ArrayList<String> GetfavoriteGenres(){
		 return (ArrayList<String>) this.genres;
	 }
	
	@Override
	public ArrayList<UserComponent> getUser() {
		return this.groupUsers;
	}

	public void addToGroup(ArrayList<UserComponent> list) {
		if (this.getGroupUsers().isEmpty()) {
			this.getGroupUsers().addAll(list);
			System.out.println(
					"El primer usuario agregado al grupo " + this.getName() + " es \n" + list.get(0).getName()+ "\n");
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

	public Collection<UserComponent> getGroupUsers() {
		return groupUsers;
	}

	@Override
	public String toString() {
		return "\nNombre del grupo " + this.getName() + "\nCantidad de miembros: " + groupUsers.size() + "\nPelículas vistas:"
				+ seenMovies + "]";
	}

}
