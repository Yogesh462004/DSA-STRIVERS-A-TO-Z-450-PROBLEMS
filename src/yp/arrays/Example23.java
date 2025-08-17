package yp.arrays;

public class Example23 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,0,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, max = 0;
        for (int num : nums) {
            if (num == 1) {
                c++;
                max = Math.max(max, c);
            } else {
                c = 0;
            }
        }
        return max;
    }
}
