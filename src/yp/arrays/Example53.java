package yp.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;

public class Example53
{
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,2}));
    }
    public  static List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer>map= new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer i:map.keySet()){
            if(map.get(i)>nums.length/3){
                l.add(i);
            }
        }
        return l;

    }



}
