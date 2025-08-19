package practice;

public class Example01 {
    public static void main(String[] args) {
        System.out.println(f(6));
    }
     static int sum=0;
    public static int f(int n){
        if(n==0) return sum;
        sum=sum+n;
        f(n-1);
        return sum;
    }
}
