package arrays;

public class Example21 {
    public static void main(String[] args) {
        System.out.println(missing(new int[]{1,2,4,5}));
    }


        private static int missing(int arr[]) {
            int n = arr.length + 1;
//            long expectedSum = (long) n * (n + 1) / 2;
//            long actualSum = 0;
//            for (int num : arr) actualSum += num;
//            return (int) (expectedSum - actualSum);
            for (int i=0;i<arr.length;i++){
                if(arr[i]!=i+1) return i+1;
            }
            return -1;

    }

}
