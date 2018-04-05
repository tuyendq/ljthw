/* Hackerrank Practice > Java > Challenge 5
*  Java output formating
*/
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("============================");
		for (int i=1; i<=3; i++) {
			String s1=sc.next();
			int x=sc.nextInt();
			// Complete this line
			System.out.format("%-15s", s1);
			System.out.format("%03d", x);
			System.out.println();
		}
		System.out.println("============================");
		
		sc.close(); // MUST close sc scanner object when finish
	}
}

