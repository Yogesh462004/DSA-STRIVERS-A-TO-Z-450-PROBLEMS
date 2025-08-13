package yp.basicmaths;

public class Example07 {
    public static void main(String[] args) {
        int n = 4;
        long divsum = 0;

        for (int i = 1; i <= n; i++) {
            divsum += sum1(i);
        }

        System.out.println("Total sum of divisors from 1 to " + n + " = " + divsum);
    }

    private static int sum1(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                sum += j;
            }
        }
        return sum;
    }
}
