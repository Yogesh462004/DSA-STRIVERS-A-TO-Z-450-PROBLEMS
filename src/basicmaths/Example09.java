package basicmaths;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example09 {
    public static void main(String[] args) {
        System.out.println(printDivisors(36));

    }
    public static List< Integer > printDivisors(int n) {
        List<Integer> d=new ArrayList<>();
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0) Collections.addAll(d,i,n/i);
        }
        Collections.sort(d);

        return d;
    }
}
