package arrays;

public class Example22 {
    public static void main(String[] args) {
        System.out.println(missing(new int[]{1,2,4,5}));
    }
    private static int missing(int arr[]) {
        int xor1=0,xor2=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^arr.length+1;
        return xor1^xor2;

    }
}
