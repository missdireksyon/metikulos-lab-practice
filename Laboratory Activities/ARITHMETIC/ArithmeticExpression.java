package com.arithmetic;

public class ArithmeticExpression {

public static void main(String[] args) {

int numA = 15;
int numB = 10;
int numC = 5;
int numD = 3;
int numE = 2;
int numF = 10;
int numG = 2;

int totalA =  numA + numB;
int totalB = totalA - numC;
int totalC = totalB * numD;
int totalD = totalC / numE;
int totalE = totalD + numF;
int totalF = totalE % numG;

System.out.println("The value of total A is: " + totalA);

System.out.println("The value of total B is: " + totalB);

System.out.println("The value of total C is: " + totalC);

System.out.println("The value of total D is: " + totalD);

System.out.println("The value of total E is: " + totalE);

System.out.println("The value of total F is: " + totalF);


  }
}