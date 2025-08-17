package yp.arrays;

import java.util.Arrays;

public class Example09 {
    public static void main(String[] args) {
        rotate(new int[]{1,5,4,3});
    }
    public static void rotate(int arr[]){
        int n=arr.length;
        int x=arr[0];
        for(int i=0;i<=n-2;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=x;

        System.out.println(Arrays.toString(arr));
    }
}
