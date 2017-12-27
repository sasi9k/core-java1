package com.core.java;

public class Exceptions {
	public static void main(String[] args) {
		int i =CalculateException();
		System.out.println(i);
	}

	public static int CalculateException() {
		try{
			int i=1/0;
			System.out.println(i);
			return i;
		} catch (ArithmeticException e){
			System.out.println("arthematic exception");
		e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("exception");
		}
		finally{
			System.out.println("everything is going good");
			
			
		}
		return 0;
	}

}
