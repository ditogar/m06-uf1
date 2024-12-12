package uf1.p3.ex2;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        ints.forEach(n -> System.out.println(Math.pow(n, 2)));
    }
}
