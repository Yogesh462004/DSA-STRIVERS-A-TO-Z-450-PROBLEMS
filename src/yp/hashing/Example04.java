package yp.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class Example04 {
    public static void main(String[] args) {
        System.out.println(mostFreqEle(new char[]{'a','b','c','a','b','a','d','A','A','A','A','A','A','A','A','A'}));

    }
    public static char mostFreqEle(char[] arr) {

        Map<Character, Integer> freq = new HashMap<>();
        int maxFreq = 0;

// Step 1: Count frequencies
        for (char num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(num));
        }

// Step 2: Find largest number among those with max frequency
        char ans = Character.MIN_VALUE;
        for (char num : freq.keySet()) {
            if (freq.get(num) == maxFreq && num > ans) {
                ans = num;
            }
        }

        return ans;}
}
