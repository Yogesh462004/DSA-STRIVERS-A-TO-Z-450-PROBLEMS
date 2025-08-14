package yp.sorting;

import java.util.Arrays;

public class Example05 {
    public static void main(String[] args) {
        int arr[] = {10, 5, 7, 7, 98};
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void QuickSort(int[] arr, int low, int high) {
        if (low >= high) return; // Correct base case
        int partition = partition(arr, low, high);
        QuickSort(arr, low, partition - 1);
        QuickSort(arr, partition + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) i++;
            while (arr[j] > pivot && j >= low + 1) j--;

            if (i < j) {
                swap1(arr, i, j);
            }
        }
        swap1(arr, low, j);
        return j;
    }

    private static void swap1(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
