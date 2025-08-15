package yp.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example07 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{10,4,7,7,10}));
    }
    static ArrayList<Integer> removeDuplicates(int[] arr) {
//        Set<Integer> set = new LinkedHashSet<>();
//        for (int num : arr) {
//            set.add(num);
//        }
        Set<Integer> set = new LinkedHashSet<>(Arrays.stream(arr).boxed().toList());
        int[] uniqueArr = new int[arr.length];
        int i = 0;
        for (int num : set) {
            uniqueArr[i++] = num;
        }
        System.out.println(Arrays.toString(uniqueArr));
        return new ArrayList<>(set);
    }
}
