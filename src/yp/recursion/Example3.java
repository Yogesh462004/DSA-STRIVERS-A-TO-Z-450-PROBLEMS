package yp.recursion;

public class Example3 {
    public static void main(String[] args) {
        m1(3);
    }
    static int count=0;
    public static void m1(int n){
        if(n==0) {
            return;
        }
        m1(n-1);
        System.out.print(n);
    }
}
