package patterns;

public class Example21 {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
            char c=(char)(64+n);
            for(int j=0;j<i+1;j++){
                System.out.print(c+" ");
                c--;
            }
            System.out.println();
        }
    }
}
