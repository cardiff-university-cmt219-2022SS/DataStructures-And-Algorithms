package cn.allwayz.Learning.Week1.CMT219_Exercise_Set_1_Code;// package import missing

import java.util.Scanner;

/**
 * @author allwayz
 */
public class RewriteNumber {
	public static void main(String[] args) {
	    Scanner in = new Scanner( System.in );
	    System.out.println( "Enter an integer between 0 and 9" );
	    int num = in.nextInt();

		switch (num){
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;

			default:
				break;
		}
	    
//	    System.out.println( "You entered " + num );
	}
}
