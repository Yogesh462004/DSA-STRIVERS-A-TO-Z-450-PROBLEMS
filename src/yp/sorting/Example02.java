package yp.sorting;

import java.util.Arrays;

public class Example02 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{14,47,8,0,1,7,2,3})));

    }
    public static int [] sort(int [] arr){
        int n=arr.length;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            n--;
        }
        return arr;
    }

}
