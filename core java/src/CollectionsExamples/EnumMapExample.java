package CollectionsExamples;

import java.util.EnumMap;

 enum keys{
	 one,two,three
 }
	
	
public class EnumMapExample {
	EnumMap<keys,String> em = new EnumMap<keys,String>(keys.class);
	
}
