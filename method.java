package programming_hack;

import java.util.Scanner;

public class Method {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		static int logic(int x, int y)
		{
			int z;
			if(x>y)
			{
				z=(x-y);
			}
			
			else {
				z=(x+y);
		}
		
			return z;
	}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Your Good Name");
			String name = sc.next();
			System.out.println("Enter the value of A");
			int a = sc.nextInt();
			
			System.out.println("Enter the value of A");
			int b = sc.nextInt();
			
       
             int c=logic(a,b);
         
         System.out.println(c);
			
			
}

		}
