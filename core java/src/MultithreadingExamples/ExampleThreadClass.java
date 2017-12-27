package MultithreadingExamples;

public class ExampleThreadClass extends Thread {
	public void run(){
		System.out.println("my thread is running");
	}
	public static void main(String[] args) {
		ExampleThreadClass t1 = new ExampleThreadClass();
		t1.start();
	}
	

}
