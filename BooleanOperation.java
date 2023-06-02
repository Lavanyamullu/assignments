//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
import java.util.Scanner;
public class BooleanOperation {
  public static void main(String[] args) {
    Scanner r=new Scanner(System.in);
    System.out.println("BooleanOperation");
    boolean b=r.nextBoolean();
    System.out.println(!(b));
  }
}