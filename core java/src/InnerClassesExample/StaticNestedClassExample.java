package InnerClassesExample;

import InnerClassesExample.schoolbus.stop;

public class StaticNestedClassExample {

	public static void main(String[] args) {
		stop.msg();
		
	}

}
class schoolbus{
	static String kids = "5";
	static class stop{
		static void msg(){
			System.out.println("number of kids entered "+ kids);
		}
	}
}