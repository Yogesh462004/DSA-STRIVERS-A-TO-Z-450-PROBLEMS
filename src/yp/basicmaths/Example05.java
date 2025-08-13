package yp.basicmaths;

public class Example05 {
    public static void main(String[] args) {
        System.out.println(m1(121));
    }
    public static boolean m1(int n){
        int  r=0;
        int x=n;
        boolean isnegative;
        if(x<0)  n=-(n);
        while ((n)>0){
            r=r*10+n%10;
            n=n/10;
        }

        if(r==x) return true;
        else return false;
    }
}
