// import java.io.*;
import java.util.*;

public class Substring {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a string WITHOUT blank space below:");
        String str = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        System.out.println(str.substring(start, end));

    }
}