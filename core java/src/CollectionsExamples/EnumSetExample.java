package CollectionsExamples;

import java.util.EnumSet;
import java.util.Set;

enum days{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class EnumSetExample {
public static void main(String[] args) {
	Set<days> set = EnumSet.allOf(days.class);
	System.out.println(set);
	
}
}
