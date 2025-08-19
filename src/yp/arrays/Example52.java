package yp.arrays;

import java.util.ArrayList;

public class Example52 {
    public static void main(String[] args) {

    }
    ArrayList<Integer> nthRowOfPascalTriangle(int rowIndex) {
        ArrayList<Integer> row = new ArrayList<>();
        long val = 1;  // first element is always 1

        row.add(1);
        for(int i=1;i<rowIndex;i++){
            val=val*(rowIndex-i);
            val=val/(i);
            row.add((int)val);
        }
        return row;
    }
}
