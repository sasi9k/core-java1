package InnerClassesExample;

public class InnerClassExample {

	public static void main(String[] args) {
	Sasi.sixpack su = new Sasi().new sixpack();
	System.out.println(su.s);
	

	}

}
class Sasi{
	class sixpack{
		String s = "comming soon";
	}
}