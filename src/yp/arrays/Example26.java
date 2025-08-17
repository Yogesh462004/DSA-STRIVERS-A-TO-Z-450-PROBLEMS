package yp.arrays;

public class Example26 {
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{10, 4,1, 2, 1,2,10,27, 1,1,1,1,1,10},15));
    }
    public static int longestSubarray(int[] arr, int k) {
        int sub=0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    sub=Math.max(sub,(j-i+1));

                }
            }

        }
        return sub;
    }
}
