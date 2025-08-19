package recursion;

public class Example10 {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
    static int c=0;
    public static int fib(int n) {
           if(n<=1) return n;
           int last=fib(n-1),secondlast=fib(n-2);
           return last+secondlast;
    }
}
