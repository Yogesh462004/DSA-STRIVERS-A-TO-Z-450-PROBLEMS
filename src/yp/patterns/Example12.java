package yp.patterns;

public class Example12 {
    public static void main(String[] args) {
        int n=3;

        for(int i=0;i<n*2-1;i++){
            int s=i+1;

            if(i>=n){

             s=2*n-i-1;
            }
            for(int j=0;j<s;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
