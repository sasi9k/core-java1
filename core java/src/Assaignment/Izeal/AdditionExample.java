package Assaignment.Izeal;

import java.util.Scanner;

public class AdditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("enter b value:"); int b = scanner.nextInt(); int
		 * sum = 0; for (int i = 0; i <= b; i++) { //
		 * System.out.println("enter a value:");
		 * 
		 * // System.out.println(i);
		 * 
		 * sum+=i;
		 * 
		 * 
		 * } System.out.println("sum is " + sum);
		 */
		/*
		 * List<String> students = new ArrayList<String>();
		 * students.add("sasi"); students.add("gowtham");
		 * students.add("rajeev"); students.add("surya"); students.add("satya");
		 * students.add("anoosha"); System.out.println("Before sorting:"); for
		 * (String p : students) {
		 * 
		 * System.out.println(p);
		 * 
		 * } Collections.sort(students);
		 * System.out.println("-----------------------");
		 * 
		 * System.out.println("After sorting:"); 

		 */

		// System.out.println("enter b value:");
		// int b = scanner.nextInt();
		// int c = a+b;
		// System.out.println("total is "+c);

		/*
		 * int sum = 0;
		 * 
		 * 
		 * for(int i=0;i<=100;i++){ // int sum = 0; //System.out.println(i);
		 * 
		 * sum+=i; // System.out.println("sum is "+ sum ); }
		 * System.out.println("sum is "+ sum );
		 */

		double sum = 0;
		
			Scanner sc = new Scanner(System.in);
			
			double numbers = 0;
			System.out.println("Enter values here");
			String line = sc.nextLine();
			sc = new Scanner(line);
			while (sc.hasNextDouble()) {
				numbers = sc.nextDouble();
				sum += numbers;
			}

			System.out.println("Sum = " + sum);

			//System.out.println("Enter values here");
	}

}
