package yp.patterns;

public class Example2 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    public static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
