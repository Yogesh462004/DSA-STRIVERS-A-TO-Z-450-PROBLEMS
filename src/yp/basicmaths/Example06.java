package yp.basicmaths;

public class Example06 {
    public static void main(String[] args) {
        System.out.println(m1(-371));
    }
    public static boolean m1(int n){
        int x=n;
        if(x<0) n=-(n);
        int cubesum=0;
        while(n>0){
            int lastdigit=n%10;
            cubesum= (int) (cubesum+(Math.pow(lastdigit,3)));
            n=n/10;
        }
        System.out.println(cubesum);
        if(cubesum==Math.abs(x)) return true;
        else return false;
    }
}
