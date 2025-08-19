package arrays;

import java.util.Arrays;

public class Example41 {
    public static void main(String[] args) {
        nextPermutation(new int[]{2, 4, 1, 7, 5, 0});
    }

    static void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;

        // Step 1: Find the first decreasing element from right
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // If no such index, array is in descending order => last permutation
        if (index == -1) {
            reverseArray(arr, 0, n - 1);
            System.out.println(Arrays.toString(arr));
            return;
        }

        // Step 2: Find element just larger than arr[index] from right
        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        // Step 3: Reverse the suffix
        reverseArray(arr, index + 1, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    // User-defined method to reverse array from l to r
    public static void reverseArray(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
