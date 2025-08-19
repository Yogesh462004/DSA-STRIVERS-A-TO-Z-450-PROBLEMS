package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class Example03 {
    public static void main(String[] args) {
        System.out.println(mostFreqEle(new int[]{3 ,0 ,0, 3, 8}));

    }
    public static int mostFreqEle(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;

// Step 1: Count frequencies
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(num));
        }

// Step 2: Find largest number among those with max frequency
        int ans = Integer.MIN_VALUE;
        for (int num : freq.keySet()) {
            if (freq.get(num) == maxFreq && num > ans) {
                ans = num;
            }
        }

        return ans;}
}
