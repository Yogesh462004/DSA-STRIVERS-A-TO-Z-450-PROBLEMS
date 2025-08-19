package yp.arrays;

import java.util.Arrays;

public class Example44 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{2, 6, 1, 9, 4, 5, 3}));
    }
    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        Arrays.sort(arr);

        int max = 1;   // at least one element
        int c = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                // duplicate → skip
                continue;
            } else if (arr[i] == arr[i - 1] + 1) {
                c++; // extend sequence
                max = Math.max(max, c);
            } else {
                c = 1; // break → restart count
            }
        }

        return max;
    }
}
