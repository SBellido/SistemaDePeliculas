/**
 * 
 */
package SistemaDePeliculas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
/**
 * @author sebst
 *
 */
public class Movie {

	public String title;
	public String synopsis;
	public ArrayList<String> actors;
	public ArrayList<String> directors;
	public ArrayList<String> categories;
	public Map<String, Integer> valuations;
	public int releaseYear;
	public double average;

	/* constructor */
	public Movie() {
		this.title = getTitle();
		this.synopsis = getSynopsis();
		this.releaseYear = getReleaseYear();
		this.actors = new ArrayList<String>();
		this.directors = new ArrayList<String>();
		this.categories = new ArrayList<String>();
		this.valuations = new HashMap<String, Integer>();
		this.average = getAverage();
	}

	public ArrayList<String> addActor(String a) {
		this.actors.add(a);
		return (ArrayList<String>) this.actors;
	}

	public ArrayList<String> addDirector(String d) {
		this.directors.add(d);
		return (ArrayList<String>) this.directors;
	}

	public ArrayList<String> addCategory(String c) {
		this.categories.add(c);
		return (ArrayList<String>) this.categories;
	}
	

//		@Override
//		public int compare(Movie m1, Movie m2) {
//			if (m2.getAverage() < m1.getAverage()) {
//				return 0;
//			} else if (m2.getAverage() > m1.getAverage()) {
//				return 1;	
//			} 
//			return -1;		
//		}
	@Override
	public String toString() {
		return "Tittle = " + this.getTitle() + "\nSynopsis = " + this.getSynopsis() + "\nActors = " + this.getActors()
				+ "\nDirectors = " + this.getDirectors() + "\nCategories = " + this.getCategories() + "\nValuations = "
				+ this.getValuations() + "\nRelease Year = " + this.getReleaseYear() + "\nAverage = "
				+ this.getAverage() + "\n-------------------------------------------------------------------\n";
	}

	/* Getters & Setters */
	public void printValuations() {
		Iterator<String> iteradorValuations = valuations.keySet().iterator();
		int count = 0;
		while (iteradorValuations.hasNext()) {
			String name = iteradorValuations.next();
			int valuation = valuations.get(name);
			System.out.print("\nEl usuario " + name + " valuo con " + valuation + " la pelicula " + this.getTitle());
			count++;
		}
		System.out.print("Cantidad valuaciones " + count + "\n");
	}

	public int getSumValuations() {
		int sum = 0;
		Iterator<Integer> iteradorValuations = valuations.values().iterator();
		while (iteradorValuations.hasNext()) {
			int valuation = iteradorValuations.next();
			sum += valuation;
		}
		return sum;
	}

	public double getAverage() {
		double cant = this.valuations.size();
		this.average = getSumValuations() / cant;
		return average;
	}

	

	public String getTitle() {
		return title;
	}

	public void setTittle(String title) {
		this.title = title;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public ArrayList<String> getActors() {
		return actors;
	}

	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}

	public ArrayList<String> getDirectors() {
		return directors;
	}

	public void setDirectors(ArrayList<String> directors) {
		this.directors = directors;
	}

	public ArrayList<String> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Map<String, Integer> getValuations() {
		return valuations;
	}

	public void setValuations(Map<String, Integer> valuations) {
		this.valuations = valuations;
	}

	public void setAverage(int average) {
		this.average = average;
	}





	


}
