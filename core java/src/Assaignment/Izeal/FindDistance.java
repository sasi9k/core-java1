package Assaignment.Izeal;

import java.util.Arrays;
import java.util.List;

public class FindDistance {

		public static void main(String[] args) {
		/*     String strWords = "The color of the car is blue.";
		   String word1 = "color";
		     String word2 = "blue";

		    // Remove any special chars from string
		     String strOnlyWords = strWords.replace(",", "").replace(".", "");

		     List<String> words = Arrays.asList(strOnlyWords.split(" "));
		     int index1 = words.indexOf(word1);
		     int index2 = words.indexOf(word2);
		    int distance = -1;

		    // Check index of two words
		    if (index1 != -1 && index2 != - 1) {
		        distance = index2 - index1;
		    }

		    System.out.println(distance);*/
			  String s = "The color of the car is blue";
			    String[] arr = s.split(" ");
			    int startIndex = 0;
			    int endIndex = 0;
			    for(int i=0; i<arr.length; i++){
			        if(arr[i].equals("The")){
			            startIndex = i;
			        }
			        else if(arr[i].equals("blue")){
			            endIndex = i;
			        }
			    }
			    System.out.println("distance is: " + (endIndex-startIndex));		
	}

}
