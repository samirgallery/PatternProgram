import java.lang.*;
import java.util.*;

public class Loop {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}