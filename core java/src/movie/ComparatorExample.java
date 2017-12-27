package movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import CollectionsExamples.Movie;


public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Movie> movie = new ArrayList<Movie>();
		Movie movie1 = new Movie("mahesh", "spyder");
		Movie movie2 = new Movie("mahesh", "jailavakusa");
		Movie movie3 = new Movie("jacky", "ninjango");
		Movie movie4 = new Movie("idn", "kingsman");
		movie.add(movie1);
		movie.add(movie2);
		movie.add(movie3);
		movie.add(movie4);
		Collections.sort(movie, new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				
				int hc= o1.hero.compareTo(o2.hero);
				int nc= o1.name.compareTo(o2.name);
				if(hc==0){
					if(nc==0){
						return 0;
					}else if(nc <0){
						return -1;
					}
					else if (nc >0){
						return 1;
					}
						
				}
				return hc;
			}
		});
		
	
		Iterator<Movie> itr = movie.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
