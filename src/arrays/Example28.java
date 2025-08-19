package arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Example28 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,6,0,3,4,15},17));

    }
   static boolean twoSum(int arr[], int target) {

       HashSet<Integer> set = new HashSet<>();
       for (int num : arr) {
           if (set.contains(target - num)) {
               return true; // found a pair
           }
           set.add(num);
       }
        return false;
    }
}
