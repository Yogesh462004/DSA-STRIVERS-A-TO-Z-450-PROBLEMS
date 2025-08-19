package recursion;

public class Example4{
    public static void main(String[] args) {
         int count=0,c=1;

        m1(c,3);
    }
    public static void m1(int c,int n){
        if(c>n) {
            return;
        }
        m1(c+1,n);
        System.out.print(c);
    }
}
