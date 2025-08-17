package yp.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Example19 {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        Set<Integer> s1= Stream.concat(Arrays.stream(a).boxed(),Arrays.stream(b).boxed()).collect(Collectors.toSet());
        ArrayList<Integer> arr=new ArrayList<>();
        arr.addAll(s1);
        Collections.sort(arr);
        return arr;
    }
}
