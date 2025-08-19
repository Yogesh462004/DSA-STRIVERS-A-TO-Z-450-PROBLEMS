package basicmaths;

import java.util.ArrayList;
import java.util.List;

public class Example08 {
    public static void main(String[] args) {
        System.out.println(printDivisors(36));
    }
    public static List< Integer > printDivisors(int n) {
        List<Integer> d=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0) d.add(i);
        }
        return d;
    }
}
