package yp.patterns;

public class Example03 {
    static int x=5;

    public static void main(String[] args) {
        for(int i=0;i<x;i++){
       for(int j=0;j<x-i;j++){
           System.out.print("*"+" ");
       }
       System.out.println();
        }
    }
}
