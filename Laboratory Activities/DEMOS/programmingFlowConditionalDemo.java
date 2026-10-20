package com.programmingflowconditionaldemo;
public class ProgrammingFlowConditionalDemo {
	public static void main(String[] args) {
		System.out.println("===Program Flow and Conditional Statements Demo===");
		programFlowDemo();
		ifDemo();
		ifElseDemo();
		nestedIfDemo();
		switchNumericDemo();
		switchStringDemo();
		loopsDemo();
		commonErrorsDemo();
	}
	
	static void programFlowDemo() {
		System.out.println("\n---programFlowDemo (sequential)");
		int a = 5;
		int b = 3;
		int sum = a + b;
		System.out.println("Step 1:a = " + a);
		System.out.println("Step 2:b = " + b);
		System.out.println("Step 3: sum = a + b = " + sum);
		System.out.println("---end programFlowDemo");
	}
	
	static void ifDemo() {
		System.out.println("\n--- ifDemo (single test) ---");
		int n = 6;
		if (n % 2 == 0) System.out.println(n + " is even (single-line if)");
		if (n > 0) {
			System.out.println(n + " is positive (block if)");
		}
	}
	
	static void ifElseDemo() {
		System.out.println("\n--- ifElseDemo ---");
		int temperature = -5;
		if (temperature <= 0) {
			System.out.println("Its freezing (temperature = " + temperature + ")");
		} else {
			System.out.println("Above freezing (temperature = " + temperature +")");
		}
	}
	
	static void ifElseIfDemo() {
		System.out.println("\n--- ifElseIfDemo (grade mappping) ---");
		int score = 83;
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Score = " + score + " => Grade = " + grade);
	}
	
	static void nestedIfDemo() {
		System.out.println("\n--- nestedIfDemo ---");
		int age = 20;
		boolean hasPermit = true;
		if (age >= 18) {
			if (hasPermit) {
				System.out.println("Age" + age + " and has permit: can apply for full license.");
			} else {
				System.out.println("Age" + age + " but no permit: must get permit first.");
			}
		} else {
			System.out.println("Age" + age + ": too young for permit/license.");
		}
	}
	
	
	static void switchNumericDemo() {
		System.out.println("\n--- switchNumericDemo (int) ---");
		int day = 3;
		String dayName;
		switch (day) {
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thrusday";
				break;
			case 5:
				dayName = "Friday";
				break;
			case 6:
				dayName = "Saturday";
				break;
			case 7:
				dayName = "Sunday";
				break;
			default:
				dayName = "Invalid day";
				break;
		}
		System.out.println("day=" + day + " -> " + dayName);
		
		System.out.println("Demonstrating fall-through (no break):");
		int n = 2;
		switch (n) {
			case 1:
				System.out.println("case 1");
			case 2:
				System.out.println("case 2 (falls through)");
			case 3:
				System.out.println("case 3 (falls through too)");
			default:
				System.out.println("end of switch");
		}
	}
	
	static void switchStringDemo() {
		System.out.println("\n--- switchStringDemo (String) ---");
		String color = "Green";
		switch (color.toLowerCase()) {
			case "red":
				System.out.println("Stop");
				break;
			case "yellow":
				System.out.println("Caution");
			case "green":
				System.out.println("Go");
		}
	}
	
	static void loopsDemo() {
	    System.out.println("\n---loopsDemo---");
	    
	    for (int i = 1; i <= 5; i++) {
	        System.out.println("Count: " + i);
	    }

	    System.out.println("---end loopsDemo---");
	}

	
	
	static void commonErrorsDemo() {
		System.out.println("\n--- commonErrorsDemo ---");
		
		String a = new String("hello");
		String b = "hello";
		System.out.println("a == b ? " + (a == b));
		System.out.println("a.equals(b) ? " + a.equals(b));
		
		String maybeNull = null;
		if (maybeNull != null && maybeNull.equals("test")) {
			System.out.println("equal to test");
		} else {
			System.out.println("either null or not 'test' (avoid NPE)");
		}
		
		try {
			maybeNull.equals("x");
		} catch (NullPointerException ex) {
			System.out.println("Caught NPE - avoid calling methods on null");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	