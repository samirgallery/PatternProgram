package pack_loop;

public class TraianglePattern {
    public static void main(String[] args) {
        int i,j;
        for(i=5;i<=5;i++){
            for(j=1;j<=i;j++){
                if(i==5 || i==j-1){
                    System.out.print("* ");
                }
                System.out.print("  ");

            }
        }
        System.out.println();
    }
}
