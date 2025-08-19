package patterns;

public class Example24 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++) {
            if (i == 1 || i == n) {

                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            } else {

                for (int j = 1; j < 2; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j < 2; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}


/*

*/