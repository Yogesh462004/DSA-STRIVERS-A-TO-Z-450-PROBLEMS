package arrays;

import java.util.ArrayList;
import java.util.List;

public class Example39 {
    public static void main(String[] args) {

        rearrangeArray(new int[]{9, 4, -2, -1, 5, 0, -5, -3, 2});
    }
    public static int[] rearrangeArray(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Split into positives and negatives
        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int[] result = new int[arr.length];
        int i = 0, j = 0, k = 0;

        // Alternate placement
        while (i < pos.size() && j < neg.size()) {
            result[k++] = pos.get(i++);
            result[k++] = neg.get(j++);
        }

        // Add remaining positives
        while (i < pos.size()) result[k++] = pos.get(i++);

        // Add remaining negatives
        while (j < neg.size()) result[k++] = neg.get(j++);

        return result;
    }
}
