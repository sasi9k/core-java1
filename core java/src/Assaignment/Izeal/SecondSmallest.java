package Assaignment.Izeal;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = new int[5];
a[0]= -4;
a[1]= 14;
a[2]= 54;
a[3]= -45;
a[4]= -89;
Arrays.sort(a);

for(int b: a){
	System.out.println(b);
	
}
System.out.println("Second smallest"+a[1]);
	}

}
