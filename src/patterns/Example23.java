package patterns;

public class Example23 {

    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=2*n-1;i++){
            int spaces,stars;
            if(i>n){
                 spaces=2*i-2*n;
                 stars=2*n-i;
            }else{
                 spaces=2*n-2*i;
                 stars=i;
            }

            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            for (int k=1;k<=spaces;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
