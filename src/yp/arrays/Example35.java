package yp.arrays;

public class Example35 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4,4,5}));
    }
    public static int maxSubArray(int[] arr) {
        /* int maxsum=arr[0];
         int sum=arr[0];
         for(int i=1;i<arr.length;i++){

             sum=Math.max(arr[i],sum+arr[i]);
             maxsum=Math.max(sum,maxsum);
         }
         return maxsum;*/
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            maxsum=Math.max(sum,maxsum);

            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }

}
