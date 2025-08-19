package yp.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Example43 {
    public static void main(String[] args) {
        System.out.println(leaders(new int[]{17,18,5,4,6,1}));
    }
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer>l=new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        l.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                  l.add(arr[i]);
                  max=arr[i];
            }
        }
        Collections.reverse(l);
        return l;
    }
}
