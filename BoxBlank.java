import java.lang.*;
import java.util.*;

public class BoxBlank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, n;
        System.out.println("Enter the Pattern Program No ");
        n = scan.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 5 - i; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
