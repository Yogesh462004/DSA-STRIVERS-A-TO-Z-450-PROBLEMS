package recursion;

public class Example2 {
    public static void main(String[] args) {
        m1(3);
    }
    static int count=0;
    public static void m1(int n){

        if(n==0) return;
        System.out.print((n)+" ");
        m1(n-1);

    }
}
