package com.rangedetector;
import java.io.Console;

public class RangeDetector {

	public static void main(String[] args) {
		Console con = System.console();
		System.out.println("Range is from 1..20");
		int x = Integer.parseInt(con.readLine("Enter value: "));
			if ( x >= 10 && x <= 20) {
				System.out.println("In Range");
			}
			else {
				System.out.println("Out of Range");
			}

	}
}