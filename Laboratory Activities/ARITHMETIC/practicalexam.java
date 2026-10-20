package com.practicalexam;

import java.util.Scanner;

public class practicalexam {

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter integer values for numA to numG ");
  System.out.println(" ");
  System.out.println("Enter numA:");
    int numA = sc.nextInt();
    System.out.println("Enter numB:");
  int numB = sc.nextInt();
  System.out.println("Enter numC:");
  int numC = sc.nextInt();
  System.out.println("Enter numD:");
  int numD = sc.nextInt();
  System.out.println("Enter numE:");
  int numE = sc.nextInt();
  System.out.println("Enter numF:");
  int numF = sc.nextInt();
  System.out.println("Enter numG:");
  int numG = sc.nextInt();
  
System.out.println(" ");
int totalA =  numA + numB;
int totalB = totalA - numC;
int totalC = totalB * numD;
int totalD = totalC / numE;
int totalE = totalD + numF;
int totalF = totalE % numG;

System.out.println("The value of total A is " + totalA);

System.out.println("The value of total B is " + totalB);

System.out.println("The value of total C is " + totalC);

System.out.println("The value of total D is " + totalD);

System.out.println("The value of total E is " + totalE);

System.out.println("The value of total F is " + totalF);

System.out.println(" ");

System.out.println("The traffic signal for the totalF is: " + totalF);
   
System.out.println(" ");

   if (totalF == 1) {
     System.out.println("STOP!");
   } else if (totalF == 2) {
   System.out.println("SHOP!");
   } else if (totalF == 3) {
   System.out.println("GO!");
   } else {
     System.out.println("Please select traffic signal.");
   } 
   
   sc.close();
   
  }
}