package yp.arrays;

import java.util.HashMap;

public class Example34 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,3,1,3,1,3,3,15,7,8}));
    }
    public static int majorityElement(int[] nums) {
        int c=0,el=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                c=1;
                el=nums[i];
            } else if (nums[i]==el) {
                c++;
            }else{
                c--;
            }

        }
        int c1=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==el) c1++;
        }
        if(c1>(nums.length/2)){
            return el;
        }
        return -1;
    }
}
