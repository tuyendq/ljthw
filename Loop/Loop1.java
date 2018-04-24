import java.util.*;

public class Loop1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Assign an interger to t variable: ");
        int t = sc.nextInt();

        for (int i=0; i<t; i++){
            System.out.print("Assign an interger to n variable: ");
            int n = sc.nextInt();
            System.out.print("Assign an interger to a variable: ");
            int a = sc.nextInt();
            System.out.print("Assign an interger to b variable: ");
            int b = sc.nextInt();

            System.out.print((i+1) + ": The array result is: ");
            int s = a;
            for (int j=0; j<n; j++){
                s += Math.pow(2, j) * b;
                System.out.print(s);
                if (j < (n-1)) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                    break;
                }
            }
        }        
        sc.close();
    }
}