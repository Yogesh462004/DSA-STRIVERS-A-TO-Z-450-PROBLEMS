package yp.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Example02 {
    public static void main(String[] args) {
        System.out.println(frequencyCount(new int[]{1}));
    }
    public static List<Integer> frequencyCount(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            l.add(map.getOrDefault(i,0));
        }
        return l;
    }
}
