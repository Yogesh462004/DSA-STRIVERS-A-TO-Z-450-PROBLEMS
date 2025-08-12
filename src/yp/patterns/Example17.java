package yp.patterns;

public class Example17 {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            int num=65;
            for(int j=0;j<n-i;j++){
                System.out.print((char)num+" ");
                num=num+1;

            }
            System.out.println();
        }
    }
}
