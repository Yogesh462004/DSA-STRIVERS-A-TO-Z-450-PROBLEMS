package patterns;

public class Example13 {
    public static void main(String[] args) {
        int start=1;
        int n=5;
        for(int i=0;i<n;i++){
            if(i%2==0) start=1;
            else  start=0;
            for(int j=0;j<i+1;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
}
