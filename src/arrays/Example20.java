package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Example20 {
    public static void main(String[] args)
    {
        System.out.println(intersection1(new int[]{1, 1, 2, 2, 45, 7}, new int[]{2, 48, 1,1}));

    }
    private static ArrayList<Integer> intersection1(int[] a, int[] b) {
        Set<Integer> s1 = new HashSet<>();
        for (int num : a) s1.add(num);

        Set<Integer> s2 = new HashSet<>();
        for (int num : b) s2.add(num);

        s1.retainAll(s2); // keep only common elements
        return new ArrayList<>(s1);
    }
}
