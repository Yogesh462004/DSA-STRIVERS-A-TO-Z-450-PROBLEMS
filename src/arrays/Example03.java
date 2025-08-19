package arrays;

import java.util.Arrays;

public class Example03 {
    public static void main(String[] args) {
        System.out.println(largest(new int []{108,4,7,85,95,95,108,109,109,109}));
    }
    public static int largest(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int max=arr[n-1];
        int secondmax=arr[n-2];
        for(int i=n-2;i>=0;i--){
            if(max==arr[i]){
                secondmax=arr[i-1];
            }
        }



        return secondmax;
    }
}
