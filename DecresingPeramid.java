import java.util.Scanner;

public class DecresingPeramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, n;
        System.out.println("Enter the Pyramid Patter No ");
        n = scan.nextInt();
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
