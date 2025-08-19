package arrays;

public class Example25 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,1,2,2,2,1,3,1,3}));

    }
    public static int singleNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}
