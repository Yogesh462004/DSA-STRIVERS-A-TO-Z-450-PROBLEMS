package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Example40 {
    public static void main(String[] args) {
      rearrangeArray(new int[]{9, 4, -2, -1, 5, 0, -5, -3, 2});
    }
    public static int[] rearrangeArray(int[] arr) {
        int[] result = new int[arr.length];
        int posIndex = 0, negIndex = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[posIndex] = arr[i];
                posIndex += 2;
            } else {
                result[negIndex] = arr[i];
                negIndex += 2;
            }
        }

        // Copy back into arr (so your function still modifies original array)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
