package ObjectExamples;

public class ByMethod {
	int id;
	String name;
	double percentage;
	void getit(int i, String n, double p){
	id=i;
	name=n;
	percentage = p;
	}
	public void printit(){
		System.out.println(id+" "+name+" "+percentage);
	}
public static void main(String[] args) {
	ByMethod b = new ByMethod();
	b.getit(20, "sasi", 30.5);
	b.printit();
}
}
