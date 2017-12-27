package Assaignment.Izeal;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// int[] b = { 45, 145, 455, 459, 45, 495, 458 };

		int b[] = new int[7];
		b[0] = 45;
		b[1] = 145;
		b[2] = 455;
		b[3] = 459;
		b[4] = 37;
		b[5] = 495;
		b[6] = 458;
		
		for (int i = 0; i < b.length; i++){
			System.out.println(b[i]);
		}
		System.out.println("---------------");
		
		for (int i=0; i< b.length; i++){
			for( int j= i+1; j< b.length; j++){
				int t = 0;
				if(b[i]>b[j]){
					t = b[i];
					b[i]= b[j];
					b[j]= t;
					
				}
			}
		}
		for (int i = 0; i < b.length; i++){
			System.out.println(b[i]);
		}
System.out.println("--------");
		int largest = 0;
		 Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			if (b[i] > largest) {

				largest = b[i];

			}

			System.out.println(b[i]);
		}
		
		System.out.println("---------------------");
		System.out.println(largest);

	}

}
