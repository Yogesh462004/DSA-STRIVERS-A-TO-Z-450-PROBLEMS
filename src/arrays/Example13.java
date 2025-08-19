package arrays;

import java.util.Arrays;

public class Example13 {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,47,48},2);
    }
    public static void rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int arr[],int start,int end){
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
}
