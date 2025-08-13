package yp.basicmaths;

public class Example01 {
    public static void main(String[] args) {
        int n=-77889;
        int count=0;
         if(n<0){
             System.out.print("-");
             n=-(n);
         }

        while (n>0){
            System.out.print(n%10);
            count++;
            n=n/10;
        }
        System.out.println();
        System.out.println("Number of digits are:"+count);
    }
}
