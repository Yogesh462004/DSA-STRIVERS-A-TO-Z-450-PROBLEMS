package arrays;

import java.util.Arrays;

public class Example45 {
    public static void main(String[] args) {
        int arr[][] = {
            {  0, 1,  2,0 },
            { 1,  2,  6,2 },
            {  1, 3,  1 ,8}
        };
        setZeroes(arr);
    }
    public static void setZeroes(int[][] arr) {
        // Number of rows
        int n = arr.length;
        // Number of columns (assuming rectangular array)
        int m = arr[0].length;
        int col[]=new int[m];
        int row[]=new int[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]!=0||col[j]!=0){
                    arr[i][j]=0;
                }
            }
        }
        System.out.println("hello");
        System.out.println(Arrays.deepToString(arr));
    }
}
