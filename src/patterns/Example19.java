package patterns;

public class Example19 {
    public static void main(String[] args) {
       int n=6;
        for(int i=0;i<n;i++){
            char C='A';
            int breakpoint=(2*i+1)/2;
            for(int  j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int k=0;k<(2*i+1);k++){

                System.out.print(C);
                if(k<breakpoint) C++;
                else C--;
            }

            System.out.println();
        }
    }
}
