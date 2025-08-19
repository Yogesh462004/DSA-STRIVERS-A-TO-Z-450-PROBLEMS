package patterns;

public class Example10 {
    public static void main(String[] args) {
        m1(5);
        m2(5);
    }
    public static void m2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*n-(i*2+1));k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void m1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
