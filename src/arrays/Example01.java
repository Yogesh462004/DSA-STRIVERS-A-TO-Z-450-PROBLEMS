package arrays;

public class Example01 {
    public static void main(String[] args) {
        System.out.println(largest(new int []{108,4,7,85,95}));
    }
    public static int largest(int[] arr) {
        int max=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }
}
