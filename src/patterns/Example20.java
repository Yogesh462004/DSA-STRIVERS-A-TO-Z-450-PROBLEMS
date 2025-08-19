package patterns;
/*
F
E F
D E F
C D E F //3 3
B C D E F
A B C D E F
*/
public class Example20 {
    public static void main(String[] args) {
        int n=3;

        for(int i=0;i<n;i++){
            char c=(char)(64+n);
            char d=(char)(64-i+n);
            for(int j=0;j<i+1;j++){

                if(j>=i){
                    System.out.print(c);
                }else{
                    System.out.print(d);
                    d++;
                }
            }
            System.out.println();

        }
    }
}
