package yp.arrays;

import java.util.Arrays;

public class Example12 {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,47,48},2);
    }
    public static void rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int temp[]=new int[n-k];

        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }
        for(int i=n-k;i<n;i++){
            arr[i-(n-k)]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i]=temp[i-(k)];
        }
        System.out.println(Arrays.toString(arr));
    }
}


