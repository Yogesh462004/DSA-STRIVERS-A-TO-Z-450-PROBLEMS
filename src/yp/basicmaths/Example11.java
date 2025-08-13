package yp.basicmaths;

public class Example11 {
    public static void main(String[] args) {
        int n=20;
        int m=40;
        int x=Math.max(n,m);
        int max=0;
        for(int i=1;i<=x;i++){
            if(n%i==0 && m%i==0) max=i;
        }
        System.out.println(max);
    }
}
