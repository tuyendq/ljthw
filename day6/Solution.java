/* Day 6: Let's review - 30 Days of Code - Java */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner in = new Scanner(System.in);
        int i = in.nextInt(); // Read in an integer
        String str; // To store read in a string
        char[] s; // To store an array of characters
        int len = 0; // Length of string
        int j; //j run from 1 to i
        for (j=1;j<=k;j++) {
            str = in.next(); // Read in a string
            s = str.toCharArray(); // Convert str to an array of characters
            len = str.length();
            for (int k=0; k<=(len-1);k+=2) {
                System.out.print(s[k]);
            }
            System.out.print(" ");
            for (k=1;k<=(len-1);k+=2) {
                System.out.print(s[k]);
            }
            System.out.println();
        }
        in.close();
    }
}