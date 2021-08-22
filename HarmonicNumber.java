package Core_Programs;

import java.util.Scanner;

public class HarmonicNumber {
	
	static double harmonic(int n) 
		{
			double h = 1;
			for (double i = 2; i <=n; i++)
			{
				h = h + 1 / i;
			}
		return h;
	    }

		public static void main(String[] args)
		{
			Scanner sc = new Scanner (System.in);
			try {
				System.out.println("enter harmonic no to find");
			int n = sc.nextInt();
			System.out.println(harmonic(n));
			} catch (Exception e) {
				System.out.println("enter integer");
	            main(args);		
			}
			sc.close();
		}
		
			
}
