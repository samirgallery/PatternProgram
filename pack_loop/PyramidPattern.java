package pack_loop;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the pattern No ");
        n=scan.nextInt();
        for (i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
