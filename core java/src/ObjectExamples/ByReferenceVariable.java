package ObjectExamples;

public class ByReferenceVariable {
	
	int id;
	String name;
	

	public static void main(String[] args) {
		ByReferenceVariable b = new ByReferenceVariable();
		b.id=5;
		b.name = "sasi";
		System.out.println(b.id+" "+b.name);
		

	}

}
