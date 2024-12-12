package uf1.p3.lazy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lazy {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(nums);

        nums.stream().map(Lazy::sumaDos).map(Lazy::multiplicaPerDos)
                .forEach(System.out::println);
    }
    public static int sumaDos(int num){
        System.out.println("Sumant...");
        return num + 2;
    }

    public static int multiplicaPerDos(int num){
        System.out.println("Multiplicant...");
        return num * 2;
    }
}
