package pack_loop;

public class trinaglePattern {
    public static void main(String[] args) {

        for(int i=5;i>=1;i--){
            for(int j=1;j<=9;j++){
                if(j<=9-i){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }


}
