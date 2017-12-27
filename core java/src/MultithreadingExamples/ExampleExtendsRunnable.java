package MultithreadingExamples;

public class ExampleExtendsRunnable implements Runnable{

	@Override
	public void run() {

try{
	for(int i=0;i<20;i++){
		System.out.println(i);
	}
} catch(Exception e){
	System.out.println("exception");
}
	System.out.println("i am in");	
	}
	
	public static void main(String[] args) {
		ExampleExtendsRunnable e = new ExampleExtendsRunnable();
		Thread t = new Thread(e);
		t.start();
		
	}

}
