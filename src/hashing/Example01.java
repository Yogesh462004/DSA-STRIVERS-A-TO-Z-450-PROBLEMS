package hashing;

import java.util.Collections;
import java.util.List;

public class Example01 {
    public static void main(String[] args) {
        System.out.println(count(1));
    }
    public static int count(int k){
        List<Integer> list = List.of(1, 2, 1, 3, 2);
        Integer [] arr=list.toArray(new Integer[0]);
        int [] arr1=list.stream().mapToInt(Integer::intValue).toArray();
        int count=0;
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]==k) count++;

        }
       int c= Collections.frequency(list,1);
        System.out.println("Using Collections::"+c);
//        for(Integer i:list){
//            if (i==k) count++;
//        }
//
        return count;
    }
}
