package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Example29 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // number -> index

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{i,map.get(complement)};
            }
            map.put(arr[i], i);
        }

        return new int[]{};
    }
}
