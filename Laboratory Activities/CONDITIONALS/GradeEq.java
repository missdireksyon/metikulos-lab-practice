package com.gradeeq;
import java.io.Console;

public class GradeEq {

	public static void main(String[] args) {
		Console con = System.console();
		System.out.println("Compute your Grades");
		int x = Integer.parseInt(con.readLine("Enter value: "));
		
		if ( x >= 98 && x <= 100) System.out.println("Your Grade is 1.00");
		else if ( x >= 95 && x <= 97) System.out.println("Your Grade is 1.25");
		else if ( x >= 92 && x <= 94) System.out.println("Your Grade is 1.50");
		else if ( x >= 89 && x <= 91) System.out.println("Your Grade is 1.75");
		else if ( x >= 86 && x <= 88) System.out.println("Your Grade is 2.00");
		else if ( x >= 83 && x <= 85) System.out.println("Your Grade is 2.25");
		else if ( x >= 80 && x <= 82) System.out.println("Your Grade is 2.50");
		else if ( x >= 77 && x <= 79) System.out.println("Your Grade is 2.75");
		else if ( x >= 75 && x <= 6) System.out.println("Your Grade is 3.00");
		else if	( x <= 75) System.out.println("Your Grade is 5.00");


	}
}