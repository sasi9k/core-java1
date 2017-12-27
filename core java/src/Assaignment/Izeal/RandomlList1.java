package Assaignment.Izeal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomlList1 {

	public static void main(String[] args) {
		List<Double> l = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number here");
		int n  = sc.nextInt();
		int i = 0;
		//sc = new Scanner(line);
		while (i<=n) {
			l.add(Math.random());
			i++;

		}
		for (Double p : l) {

			System.out.println(p);

		}
		Collections.sort(l);
		System.out.println("------------------------");
		for (Double p : l) {

			System.out.println(p);

		}

	}

}
