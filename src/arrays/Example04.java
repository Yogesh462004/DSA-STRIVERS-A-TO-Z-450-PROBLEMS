package arrays;

public class Example04{
    public static void main(String[] args) {
        System.out.println(largest(new int []{4,2,108,4,7,85,95,107}));
    }
    public static int largest(int[] arr) {
        int max=arr[0];
        int seconmax=-1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>seconmax&&arr[i]<max){
                seconmax=arr[i];
            }
        }
        return seconmax;
    }
}
