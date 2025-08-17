package yp.arrays;

import java.util.HashMap;
import java.util.Map;

public class Example24 {
    public static void main(String[] args) {
        System.out.println(getSingle(new int[]{1,1,2,2,2}));
    }
    static int getSingle(int arr[]) {

        int m=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer n:map.keySet()){
            if(map.get(n)%2!=0){
                m=n;
            }
        }
        System.out.println(map);
            return m;
    }
}
