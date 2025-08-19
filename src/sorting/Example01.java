package sorting;

import java.util.Arrays;

public class Example01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{14,47,8,7,2,3})));
    }
    public static int [] sort(int arr[]){
        int n=arr.length-1;

        for(int i=0;i<=n-1;i++){
            int min=i;

            for(int j=i;j<=n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }


        return arr;
    }
    public void swap(int a,int b){

    }

}
