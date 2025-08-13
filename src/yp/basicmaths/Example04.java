package yp.basicmaths;

public class Example04 {
    public static void main(String[] args) {
        System.out.println(m1(1534236469));
    }
    public static int m1(int n){
        int x=n;
        if(n<0) n=-(n);
        long r=0;

        while(n>0){
            r=r*10+n%10;
            n=n/10;
        }
        if(n<0){
            return (int)-r;
        }else if (r < Integer.MIN_VALUE || r > Integer.MAX_VALUE){

            return 0;
        }

        else return (int) r;
    }
}
