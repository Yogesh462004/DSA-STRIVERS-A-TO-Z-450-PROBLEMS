package yp.arrays;

public class Example17 {
    public static void main(String[] args) {
        System.out.println(search1(new int[]{1,4,7,8,9},1));
    }

    private static int search1(int[] arr, int k) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==k) return i;
        }
        return -1;
    }
}
