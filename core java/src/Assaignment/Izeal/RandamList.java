package Assaignment.Izeal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandamList {

	public static void main(String[] args) {
		List<Double> l = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values here");
		String line = sc.nextLine();
		sc = new Scanner(line);
		while (sc.hasNextDouble()) {
			l.add(sc.nextDouble());

		}

		for (Double p : l) {

			System.out.println(p);

		}
		System.out.println("-----------");
		Collections.sort(l);
		for (Double p : l) {

			System.out.println(p);

		}

	}
}
