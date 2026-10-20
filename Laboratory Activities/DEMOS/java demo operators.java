package com.javaprogrammingbasics;
public class JavaOperatorDemo {
	public static void main(String[] args) {
		
	int a = 10, b = 3;
	System.out.println("Arithmetic: a + b = " + (a + b) + ", a % b = " + (a % b));
	
	int x = 5;
	x+= 3;
	System.out.println("Assignment: x = " + x);
	
	System.out.println("Relational: a > b? " + (a > b));
	
	boolean cond = (a > b) && (b < 0);
	System.out.println("Logical: (a > b && b < 0) = " + cond);
	
	int u = -a;
	System.out.println("Unary: -a = " + u + ", ++b = " + (++b));
	
	String status = (a > b) ? "a is greater" : "b is greater";
	System.out.println("Ternary : " + status);
	
	System.out.println("Bitwise: a & b = " + (a & b) + ", a | b = " + (a | b));
	
	double d = (double) a / b;
	System.out.println("Type Cast: (double)a/b = " + d);
	
	String s = "Hello";
	System.out.println("Instanceof: s instanceof String? " + (s instanceof String));
	
	int y = 5;
	System.out.println("Increment/Decrement: y++ = " + (y++) + ", now y = " + y);
	
	int prec = 10 + 5 * 2;
	System.out.println("Precedence: 10 + 5 * 2 = " + prec);
	}
}