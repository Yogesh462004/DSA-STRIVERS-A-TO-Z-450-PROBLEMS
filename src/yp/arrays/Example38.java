package yp.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example38 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(9, 4, -2, -1, 5, 0, -5, -3, 2));
       rearrange(arr);
    }
    static void  rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positives and negatives
        for (Integer num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int i = 0, j = 0, k = 0;

        // Alternate positive and negative
        while (i < pos.size() && j < neg.size()) {
            arr.set(k++, pos.get(i++));
            arr.set(k++, neg.get(j++));
        }

        // Add remaining positives
        while (i < pos.size()) arr.set(k++, pos.get(i++));

        // Add remaining negatives
        while (j < neg.size()) arr.set(k++, neg.get(j++));
    }
}
