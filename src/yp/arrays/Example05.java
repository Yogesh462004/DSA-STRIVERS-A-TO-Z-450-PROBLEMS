package yp.arrays;

public class Example05{
    public static void main(String[] args) {
        System.out.println(largest(new int []{4,2,108,4,7,85,95,107,109}));
    }
    public static int largest(int[] arr) {
        int max=arr[0];
        int seconmax=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                seconmax=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]>seconmax){
                seconmax=arr[i];
            }
        }


        return seconmax;
    }
}
