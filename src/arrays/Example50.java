package arrays;

import java.util.HashMap;
import java.util.Map;

public class Example50 {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3},3));
    }
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: prefixSum=0 occurs once

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;  // running sum

            // check if (prefixSum - k) was seen before
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // add/update current prefixSum frequency
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
