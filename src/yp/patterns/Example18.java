package yp.patterns;

public class Example18 {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            int num=65+i;
            for(int j=0;j<i+1;j++){
                System.out.print((char)num+" ");

            }
            System.out.println();
        }
    }
}
