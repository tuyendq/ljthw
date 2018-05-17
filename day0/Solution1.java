import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

   public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String ans=""; // Initiate answer variable
      if(n%2==1){
         ans = "Weird";
      }
      else{
         ans = "Not Weird";
      }
      System.out.println(ans);

   }
}