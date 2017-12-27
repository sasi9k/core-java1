package InnerClassesExample;

public class LocalInnerClassExample {

	public static void main(String[] args) {
		dressing d = new dressing();
		
d.dress();
	}

}
class dressing{
	void dress(){
		class casual{
	String shirt  = "formal";
	void  msg(){
		System.out.println(shirt);
	}
		}
		casual c = new casual();
		c.msg();
	}
}