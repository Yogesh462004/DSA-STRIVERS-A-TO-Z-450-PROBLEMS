package yp.arrays;

import java.util.Arrays;

public class Example11 {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7},3);
    }
    public static void rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int temp[]=new int[k];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }
        System.out.println(Arrays.toString(temp));
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }

        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }
        System.out.println(Arrays.toString(arr));
    }
}
