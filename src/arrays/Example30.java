package arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Example30 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2, 6, 0, 3, 4, 155}, 17));

    }

    static boolean twoSum(int arr[], int target) {

        Arrays.sort(arr);
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) return true;
            if (sum < target) {
                start++;
            } else  {
                end--;
            }

        }
        return false;
    }
}