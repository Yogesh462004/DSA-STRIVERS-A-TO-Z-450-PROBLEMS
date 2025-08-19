package recursion;

public class Example1 {
    public static void main(String[] args) {
        m1(3);
    }
     static int count=0;
    public static void m1(int n){
        if(count==n) return;
        System.out.print(count+1+" ");
        count++;
        m1(n);
    }
}
