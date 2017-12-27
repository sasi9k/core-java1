package com.core.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Emi {
	public static void main(String[] args) throws IOException {
		

		double emi = emicalculator();
				System.out.println(emi);
				emiCondition(emi);
	}

	public static void emiCondition(double emi) {
		if(emi>50){
			System.out.println("ok");
		}
		else if(emi<50 && emi>95){
			System.out.println("Normal");
		}
		else if (emi<95) {
			System.out.println("superb");
		}
	}

	public static double emicalculator() throws IOException {

		FileWriter fw = new FileWriter("stu1.txt");	
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner scanner = new Scanner(System.in);
		double p = scanner.nextDouble();
		double n = scanner.nextDouble();
		double r = scanner.nextDouble();
				double emi = (p*n*r)/100;
	
		
		bw.write(p+" | "+ n +"|"+ r+"|" + emi);
		//bw.flush();
		bw.close();
		return emi;
		
	}

}
