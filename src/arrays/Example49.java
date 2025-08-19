package arrays;

public class Example49 {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3},3));
    }
    public static int subarraySum(int[] nums, int k) {
        int c=0;
          for(int i=0;i<nums.length;i++){
              int sum=0;
              for(int j=i;j<nums.length;j++){

                  sum=sum+nums[j];
                  if(sum==k){
                      c++;
                  }
              }
          }
          return c;
    }
}
