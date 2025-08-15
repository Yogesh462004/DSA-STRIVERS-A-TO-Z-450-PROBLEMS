package yp.arrays;

public class Example06 {
    public static void main(String[] args) {
        System.out.println(check(new int[]{10,10,20,45,100,100}));
    }
    public static boolean check(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
