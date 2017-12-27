package CollectionsExamples;

import java.util.Comparator;

public class Students implements Comparator<Students> {
public String last;
public String first;
public Students(String last, String first){
	 this.first= first;
	 this.last= last;
	
}
@Override
public int compare(Students o1, Students o2) {
	int lt= o1.last.compareTo(o2.last);
	int fs = o1.first.compareTo(o2.first);
	
	if(lt ==0){
		if(fs==0){
			return 0;
		}else if(fs>0){
			return -1;
			
		}else if(fs<0){
			return 1;
			
		}
		
	}
	return lt;
}
 
	

}
