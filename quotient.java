package programming_hack;

import java.util.Scanner;

public class Quotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Quotient and remainder Problem");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		int quotient = a/b;
		int remainder = a%b;
		
	    System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder);
		    
		
		
	}

}
