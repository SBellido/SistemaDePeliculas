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
//	@SuppressWarnings("unlikely-arg-type")
//	public void addToGroup(ArrayList<UserComponent> list) {
//		
//		if (this.getGroupUsers().isEmpty()) {
//			this.getGroupUsers().addAll(list);
//			System.out.println(
//					"El primer usuario agregado al grupo " + this.getName() + " es \n" + list.toString() + "\n");
//		} else {
//			for (int j = 0; j < list.size(); j++) {
//				for (int i = 0; i < groupUsers.size(); i++) {
//					int isFinish = 0;
//					ArrayList<UserComponent> aux = new ArrayList<UserComponent>();
//					aux = list.get(j).getUser();
//					if (aux.equals(groupUsers.get(i))) {
//						System.out.println(aux.toString() + " ya existe en " + groupUsers.toString() + "\n");
//						break;
//					} else if (!aux.equals(groupUsers.get(i))) {
//						isFinish = i + 1;
//						if (isFinish == groupUsers.size()) {
//							this.getGroupUsers().addAll(aux);
//							System.out.println(
//									aux.toString() + " fue agregado con éxito al grupo " + this.getName()+ "\n");
//							break;
//						}
//					}
//				}			
//			}
//		}
//	}

//	}
//int value = ((UserComponent) aux.get(i)).compareTo(groupUsers.get(i));
//isFinish = i + 1;
//if (value == 1 && isFinish == groupUsers.size()) {
//	this.getGroupUsers().addAll(list);
//	System.out.println(aux.getName() + " fue agregado con éxito al grupo " + this.getName() + "\n");
//	break;
//} else if (value == 0) {
//	System.out.println(aux.getName() + " ya existe en " + groupUsers.toString() + "\n");
//	break;
//} else {
//	this.getGroupUsers().addAll(list);
//	System.out.println(aux.getName() + " fue agregado con éxito.\n");
//	break;
//}
//	public void addToGroup1(UserComponent user) {
//		int same = 0;
//		int aux = 0;
//		int value = 0;
//		if (this.getGroupUsers().isEmpty()) {
//			this.getGroupUsers().add(user);
//			System.out.println(user.getName() + "  es el primer usuario agregado al grupo " + this.getName());
//		} else {
//			for (int i = 0; i < groupUsers.size(); i++) {
//				value = groupUsers.get(i).compareTo(user);
//				if(value != same && (!groupUsers.get(i).isGroup())) {
//					aux = value;
//				} else if(groupUsers.get(i).isGroup()) {	
//					this.addToGroup(user);
//				} else {
//					aux = 0;
//					break;
//				}
//			}
//			
//			addOrNotAdd(aux, user);
//		}
//	}

	@Override
	public boolean isGroup() {
		return true;
	}

//	private void addOrNotAdd(int value, UserComponent user) {
//		if (value == 1) {
//			this.getGroupUsers().add(user);
//			System.out.println(user.getName() + " ha sido agregado a " + this.getName());
//		} else {
//			System.out.println(user.getName() + " ya es parte de " + this.getName());
//		}
//		System.out.println("hasta el momento son " + groupUsers.toString());
//		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
//	}

//	private boolean isDifferent(int value, boolean isDifferent) {
//		if (value == 1) {
//			isDifferent = true;
//		} else {
//			isDifferent = false;
//		}
//		return isDifferent;
//	}

	public Collection<UserComponent> getGroupUsers() {
		return groupUsers;
	}

	@Override
	public String toString() {
		return "Nombre del grupo" + groupUsers + "\nCantidad de miembros: " + groupUsers.size() + "\nPelículas vistas:"
				+ seenMovies + "]";
	}

}
