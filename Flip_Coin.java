package Core_Programs;

import java.util.Scanner;

public class Flip_Coin {
	private static Scanner sc;

	public static void main(String[] args) {
		
		System.out.println("number of times that coin is flip is enter here:");	


	    sc = null;
		int count = sc.nextInt();
	    double coinResult;
	    double tailcount = 0;
	    double headcount = 0;
	    
	    for (int i=1;i<=count;i++) {
	    	coinResult = Math.random();
	    	System.out.println(coinResult);
	    	if(coinResult < 0.5) {
	    	
	    	   tailcount++;
	    	}
	    	else
	    	{
	    		headcount++;
	    	}
	        }
	    
		System.out.println(headcount);	
		System.out.println(tailcount);
		double headpercent = (headcount / (double) count)*100;
		double tailpercent = (tailcount / (double) count)*100;
		
		System.out.println("head percent is:" + headpercent);
		System.out.println("tail percent is:" + tailpercent);
		
		
		}

	}
