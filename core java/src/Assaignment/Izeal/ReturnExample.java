
package Assaignment.Izeal;

public class ReturnExample {
	
	public int value (int N){
		/*int b = a+20;
		return b;*/
		 int total = 0;
		    for(int i = 1; i <= N; i++){
		      total += i;
		    }
		    return total;
		
	}
	public static void main(String[] args) {
		System.out.println("i am sasi");
		ReturnExample r = new ReturnExample();
		System.out.println(r.value(30));
	
		
	}
	

}
