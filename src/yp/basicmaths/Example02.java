package yp.basicmaths;

public class Example02 {
    public static void main(String[] args) {
        int n=20;
        int x=n;
        int count=0;
        while(n>0){
            if(n%10!=0&& x%(n%10)==0){
                count++;
            }
            if(n>0){
                n=n/10;
            };
        }
        System.out.println(count);
    }
}
