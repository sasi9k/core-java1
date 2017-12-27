package Assaignment.Izeal;

import java.util.Scanner;

public class MortageCalculator {
	public static void main(String[] args) {
		
	
	

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter principle amount:");
	double Principal = scanner.nextDouble();
	System.out.println("Enter monthlyinterest:");
	double monthlyinterest = scanner.nextDouble();
	System.out.println("Enter years:");
	double Years = scanner.nextDouble();
	
	double Payment = (Principal*monthlyinterest / 1- (1 / (1+monthlyinterest))); 
	double payment1 = Math.pow(Payment, Years)*12;
	System.out.println("Mortage value is: "+payment1);
	}
	
	
}
