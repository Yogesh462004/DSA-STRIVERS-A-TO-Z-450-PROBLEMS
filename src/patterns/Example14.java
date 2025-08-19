package patterns;

public class Example14 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            for(int k=0;k<2*n-2*(i+1);k++){
                System.out.print(" ");
            }

            for(int s=i+1;s>0;s--){
                System.out.print(s);

            }
            System.out.println();
        }
    }
}
