package arrays;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7},3);
    }
    public static void rotate(int arr[],int k){
        int n=arr.length;
         k=k%n;
        for(int j=0;j<k;j++){
            int x=arr[0];
            for(int i=0;i<=n-2;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=x;
        }

        System.out.println(Arrays.toString(arr));
    }
}
