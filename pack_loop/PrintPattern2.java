import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, n;
        System.out.println("Enter the Pattern no ");
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {

                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
