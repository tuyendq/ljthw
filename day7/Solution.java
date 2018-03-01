/* Day 7: Array
* 30 Days of Code
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        // Read STDIN and store in an arry
        System.out.println("Number of integers you want to input: [Type an integer]");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // n: Number of integers in the array
        int[] arr = new int[n]; // Declard an array of integers
        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        // Print arr in reversed order
        for (int j=n-1;j>=0;j--){
            System.out.print(arr[j] + " ");
        }
    }
}