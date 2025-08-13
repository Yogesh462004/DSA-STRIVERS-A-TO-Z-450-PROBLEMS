package yp.basicmaths;

import java.util.ArrayList;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        int n=9;
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0) {
                count++;
                if((n/i)!=i) count++;
            }
        }
        if(count==2) System.out.println("true");
        else System.out.println("false");

    }
}
