package pack_loop;

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner scam=new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the Box No ");
        n=scam.nextInt();
        for(i=0;i<=n;i++){
            for(j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
