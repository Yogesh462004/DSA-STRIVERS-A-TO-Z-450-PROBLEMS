package arrays;

import java.util.Arrays;

public class Example15 {
    public static void main(String[] args) {
        move(new int []{1,0,2,0,5,0,4});
    }
    public static void move(int[] arr ){
        int tem[]=new int[arr.length];
        int j=0;
        for(int i=0;i<tem.length;i++){
            if(arr[i]!=0){
                tem[j++]=arr[i];
            }
        }
        for(int i=0;i<tem.length;i++){
            arr[i]=tem[i];
        }
        for(int i=tem.length;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(tem));
    }
}
