package uf1.p3.ex3;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Diego", "Noel", "Jameel", "Seddik", "Ferran", "Laura");
        names.forEach(n -> System.out.println("Hola " + n + "!"));
    }
}
