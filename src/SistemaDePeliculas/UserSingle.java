package SistemaDePeliculas;

import java.util.ArrayList;

public class UserSingle extends UserComponent {
	private int age;

	public UserSingle() {
		super();
		this.age = getAge();

	}
	
	public ArrayList<UserComponent> getUser(){
		ArrayList<UserComponent> user = new ArrayList<UserComponent>();
		user.add(this);
		return user;
	}
	
	
	@Override
	public ArrayList<String> getFavoriteGenres() {
//		System.out.println("Los géneros favoritos de "+this.getName()+" son ");
		return this.genres;
	}
 
//	@Override
	public String toString() {
		return "Nombre: "+super.getName()+"\nEdad: " + this.getAge()	+ 
				"\nGéneros preferidos: " + super.genres + 
				"\nPelículas vistas: " + super.getSeenMovies();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		UserSingle other = (UserSingle) obj;
		if (seenMovies == null) {
			if (other.seenMovies != null)
				return false;
		} else if (!seenMovies.equals(other.seenMovies))
			return false;
		return true;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
