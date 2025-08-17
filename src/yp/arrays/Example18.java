package yp.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example18 {
    public static void main(String[] args) {
        System.out.println(union1(new int[]{1,1,2,2,45,7},new int[]{2,48,1}));
    }

    private static ArrayList<Integer> union1(int[] a, int[] b) {
//        Set<Integer> s1= Stream.concat(Arrays.stream(a).boxed(),Arrays.stream(b).boxed()).collect(Collectors.toSet());
//        int arr[]=s1.stream().mapToInt(Integer::intValue).toArray();
//        Arrays.sort(arr);
        Set <Integer> s1=new TreeSet<>();
        for(int num:a) s1.add(num);
        for(int num:b) s1.add(num);
        return new ArrayList<>(s1);
    }

}
