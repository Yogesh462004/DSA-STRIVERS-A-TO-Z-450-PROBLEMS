package arrays;

import java.util.Arrays;

public class Example08 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(remove(new int[]{1,1,2,2,3})));
    }
    public static int [] remove(int[] arr){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[j+1]=arr[i];
                j++;
            }
        }
        int[] result = new int[arr.length];
        for (int k = 0; k <= j; k++) {
            result[k] = arr[k]; // copy unique elements
        }
        return result;
    }
}
