package yp.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Example02 {
    public static void main(String[] args) {
        System.out.println(largest(new int []{108,4,7,85,95}));
    }
    public static int largest(int[] arr) {
        Arrays.sort(arr);
        //int max=arr[arr.length-1];
        Integer[] arr1=Arrays.stream(arr).boxed().toArray(Integer[]::new );
        Arrays.sort(arr1, Collections.reverseOrder());
        int max=arr1[0];
        return max;
    }
}
