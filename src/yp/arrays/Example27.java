package yp.arrays;

import java.util.Arrays;

public class Example27 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,6,0,11,4,15},9)));
        System.out.println(twoSum1(new int[]{2,6,0,11,4,15},9));

    }
    public static int[] twoSum(int[] arr, int target) {
          for(int i=0;i<arr.length;i++){
              for(int j=i+1;j<arr.length;j++){
                  if(arr[j]+arr[i]==target) {
                      return new int[]{i,j};
                  }
              }
          }
          return new int[]{};
    }
    static boolean  twoSum1(int arr[], int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]+arr[i]==target) {
                    return true;
                }
            }
        }
        return false;
    }
}
