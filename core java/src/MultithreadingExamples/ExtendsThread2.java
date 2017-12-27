package MultithreadingExamples;

public class ExtendsThread2 extends Thread {
	ExtendsThread2() {
		super("i am in");
		System.out.println("my thread" + this);
		start();
	}

	public void run(){
	     try
	     {
	        for (int i=0 ;i<10;i++)
	        {
	           System.out.println("Printing the count " + i);
	           Thread.sleep(1000);
	        }
	     }
	     catch(InterruptedException e)
	     {
	        System.out.println("my thread interrupted");
	     }
	     System.out.println("My thread run is over" );
	   }
	
	public static void main(String[] args) {
		ExtendsThread2 t1 = new ExtendsThread2();
		t1.start();
	}

}
