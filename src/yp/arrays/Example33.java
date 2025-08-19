package yp.arrays;

import java.util.HashMap;

public class Example33 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,3,1,3,1,3,3,15,7,8}));
    }
    public static int majorityElement(int[] nums) {
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>(nums.length/2)){
                return num;
            }

        }
        return  -1;
    }
}
