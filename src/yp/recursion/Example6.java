package yp.recursion;

import java.util.ArrayList;
import java.util.List;

public class Example6 {

    public static void main(String[] args) {
        int n=3;
        ArrayList<Long> l = new ArrayList<>();
        long fact = 1;
        long i = 1;

        while (fact <= n) {
            l.add(fact);
            i++;
            fact *= i;
        }


        System.out.println(l);
    }
    public static long fact(long n){
        long f=0;
        if(n==0) return 1;
        f=n*fact(n-1);
        return f;
    }
}
