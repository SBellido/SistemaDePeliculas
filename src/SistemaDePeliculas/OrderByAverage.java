package SistemaDePeliculas;

import java.util.Comparator;
public class OrderByAverage  implements Comparator<Movie> {

	public OrderByAverage() {
		
	}
	
    @Override
    public int compare(Movie m1, Movie m2) {
    return (int) (m1.getAverage() - m2.getAverage()); 
    
    }
}