//import java.io.*;
import java.util.Scanner;

public class Solution {

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial (n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Type in an integer: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int result = factorial(n);
        // System.out.println("So, " + n + "! is: " + result);
        System.out.printf("The factorial of %d is: %,d%n", n, result);
        System.out.println("Happy coding!");
    }
}