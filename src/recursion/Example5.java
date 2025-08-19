package recursion;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(m1(5));
    }
     static int sum=0;
    public static int  m1(int n){
        if(n==0) return 0;
        m1(n-1);
        sum=sum+n*n*n;
        return sum;


    }
}
