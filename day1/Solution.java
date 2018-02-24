import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      int i = 4;
      double d = 4.0;
      String s = "HackerRank ";

      Scanner scan = new Scanner(System.in);
      /* Decleare second interger, double, and String variables. */
      int secondInteger;
      double secondDouble;
      String secondString;
      /* Read and save an interger, double, and String to your variables */
      // Notes: Read tutorial if you have trouble
      secondInteger = scan.nextInt();
      secondDouble = scan.nextDouble();
      scan.nextLine(); // MUST move to the next line
      secondString = scan.nextLine();
      /* Print the sum of both integer variables on a new line.*/
      System.out.println(i + secondInteger);
      /* Print the sum of the double variables on a new line. */
      System.out.println(d + secondDouble);
      /* Concatenate and print the String variables on a new line.*/
      System.out.println(s + secondString);

      scan.close();
   }

}
