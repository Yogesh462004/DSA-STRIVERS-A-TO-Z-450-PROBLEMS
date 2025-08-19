package arrays;

import java.util.ArrayList;

public class Example42 {
    public static void main(String[] args) {
        System.out.println(leaders(new int[]{10, 4, 2, 4, 1}));
    }
    static ArrayList<Integer> leaders(int arr[]) {
     ArrayList<Integer>l=new ArrayList<>();
     for(int i=0;i<arr.length;i++){
         boolean isLeader = true;

         for(int j=i+1;j<arr.length;j++){
             System.out.println(arr[j]);
             if(arr[i]<arr[j]) {

                 isLeader=false;
                 break;
             }

         }
         if(isLeader==true) {

             l.add(arr[i]);
         }



     }
     return l;
    }
}
