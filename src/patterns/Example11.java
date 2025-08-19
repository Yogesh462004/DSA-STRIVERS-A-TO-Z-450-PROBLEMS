package patterns;

public class Example11 {
    public static void main(String[] args) {
        m1(6);
        m2(6);
    }
    public  static  void m1(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
    public  static void m2(int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
