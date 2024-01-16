package com.exceptn;

public class ExceptionDemo {

	public static void main(String[] args) {
		String str = "Hello";
		int l;
		int arr [] = {10,20,30,40,50,60,70};
		
		try {
			//System.out.println(arr[-1]);
			l=str.length();
			//l=10/0;
			//l=Integer.parseInt(str);
		}
		
		catch(ArrayIndexOutOfBoundsException e ) {
			e.printStackTrace();
			System.out.println("Enter the valid index value");
			
		}
		
		catch(ArithmeticException e ) {
			System.out.println("Divisor should not be 0");
		}
		
		catch(NullPointerException e) {
				System.out.println("String should not be null");
		}
		
		finally {
			System.out.println("Thankyou!!");
	}
		


	}

}
