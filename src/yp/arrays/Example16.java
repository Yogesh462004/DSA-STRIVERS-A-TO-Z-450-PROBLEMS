package yp.arrays;

import java.util.Arrays;

import static yp.arrays.Example15.move;

public class Example16 {
    public static void main(String[] args) {
        move1(new int []{1,0,2,0,5,0,4});
    }

    private static void move1(int[] arr) {
        int n=arr.length-1;
        int j=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
