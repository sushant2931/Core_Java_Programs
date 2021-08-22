package Core_Programs;

import java.util.Scanner;



	public class Leap_year {
	     public static void main(String[] args) {
			int year;
			System.out.println("please enter year :");
	    	try (Scanner sc = new Scanner(System.in)) {
				year = sc.nextInt();
			}
	    	if (((year % 4 ==0) && (year % 100!=0)) || (year%400==0))
	    		System.out.println("it is a leap year");
	    	else
	    		System.out.println("it is a not a leap year");
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
		}
		
		
		
		
		
		
		
		
		
	
}
