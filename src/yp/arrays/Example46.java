package yp.arrays;

import java.util.Arrays;

public class Example46{
    public static void main(String[] args) {
        int arr[][] = {
                {  0, 1,  2,0 },
                { 1,  2,  6,2 },
                {  1, 3,  1 ,8}
        };
        setZeroes(arr);
    }
    public static void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
       int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    //mark i-th row
                    arr[i][0]=0;
                    if(j!=0){
                        arr[0][j]=0;
                    }else{
                        col0=0;
                    }

                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]!=0){
                    if(arr[0][j]==0||arr[i][0]==0){
                        arr[i][j]=0;
                    }
                }
            }
        }
        if(arr[0][0]==0){
            for(int j=0;j<m;j++)arr[0][j]=0;
        }
        if(col0==0){
            for(int i=0;i<n;i++) arr[i][0]=0;
        }

        System.out.println("hello");
        System.out.println(Arrays.deepToString(arr));
    }
}
