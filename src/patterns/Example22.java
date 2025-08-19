package patterns;

public class Example22 {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<2*n;i++){
            int s;
            int g;
            if(i>=n){
                g=2*(2*n-i)-2;
                s=i+1-n;
            }else{
                s=n-(i);
                g=2*i;
            }

            for(int j=0;j<s;j++){
                System.out.print("* ");
            }
            for (int k=0;k<g;k++){
                System.out.print("  ");
            }
            for(int j=0;j<s;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
