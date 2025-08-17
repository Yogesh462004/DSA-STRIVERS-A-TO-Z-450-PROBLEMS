package yp.practice;

public class Example02 {
    public static void main(String[] args) {
        System.out.println(f(6));
    }

    public static int f(int n){
        if(n==0) return n;
        return n+f(n-1);


    }
}
