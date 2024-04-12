import java.lang.*;
import java.util.*;

public class IncresingPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, j, n;
        System.out.println("Enter the Pyramid Pattern no ");
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}