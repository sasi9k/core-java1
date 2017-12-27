package ObjectExamples;

public class ByConstructor {
	
	int id;
	String name;
	double percentage;
	
	
	 ByConstructor( int id, String name, double percentage){
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		System.out.println(id+" "+ name +" "+ percentage);
		
	}
	

	public ByConstructor(ByConstructor b1) {
		this.id = b1.id;
		this.name = b1.name;
		this.percentage = b1.percentage;
		//System.out.println(id+" "+ name+" "+percentage);
	}
	
	public void printsasi(){
		System.out.println(id+" "+ name+" "+percentage);
	}


	public static void main(String[] args) {
		ByConstructor b = new ByConstructor(10, "sasi", 22.87);
		ByConstructor b1 = new ByConstructor(122, "sai", 22.87);
		ByConstructor b2 = new ByConstructor(b1);
		b.printsasi();
		b1.printsasi();
		b2.printsasi();

	}

}
