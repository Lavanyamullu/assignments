//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle 
{ 
  public static void main(String[] args)
   {
      int radius, circum;
      Scanner c = new Scanner(System.in);
       System.out.print("Enter Radius of Circle: ");
      radius = c.nextInt();
       circum = (int)(2*3.14*radius);
      System.out.println("\nCircumference = " +circum);
   }
}


//Use the scanner class to provide radius at execution time

/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter radius as a positive integer");
radius= scanner.nextInt();
*/

//Caluculate the circumference of the circle

//Casting the floating-point value to int  

//Print the Result

