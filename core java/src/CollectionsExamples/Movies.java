package CollectionsExamples;

public class Movies implements Comparable<Movies>{
	
	public String name;
	public String hero;
	
 Movies(String name, String hero){
	this.name= name;
	this. hero = hero;
	
	
}
 public String toString(){
	return hero+"      "+name;
	 
 }

@Override
public int compareTo(Movies o) {
	// TODO Auto-generated method stub
	return this.hero.compareTo(o.hero);
}

}
