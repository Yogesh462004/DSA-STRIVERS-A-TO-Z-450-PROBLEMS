package yp.recursion;

public class Example08 {
    public static void main(String[] args) {
        String str="hello";
        System.out.println(new StringBuilder(str).reverse());
        char[] arr={'H','E','L','L','O'};
        int left=0,right=arr.length-1;
        while (left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
        System.out.println(arr);

    }

}
