package InnerClassesExample;

public class MemberInnerClassExample {

	public static void main(String[] args) {
		home h = new home();
		home.kitchen k = h.new kitchen();
		k.msg();

	}

}
class home{
	private String s = "knif";
	
	class kitchen{
		public void msg(){
			System.out.println("i am gona kill java with "+ s);
			
		}
	}
}