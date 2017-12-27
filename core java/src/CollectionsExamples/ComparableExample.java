package CollectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparableExample {

	public static void main(String[] args) {
	
		ArrayList<Movies> movie = new ArrayList<Movies>();
		Movies movie1 = new Movies("spyder", "mahesh");
		Movies movie2 = new Movies("jailavakusa", "ntr");
		Movies movie3 = new Movies("ninjago", "jacky");
		Movies movie4 = new Movies("kingsman", "idn");
		movie.add(movie1);
		movie.add(movie2);
		movie.add(movie3);
		movie.add(movie4);
		Collections.sort(movie);
	
		Iterator<Movies> itr = movie.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
