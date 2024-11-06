package uf1.p3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function <String, Integer> length = s -> s.length();

        String nombre = "Diego";
        int longitud = length.apply(nombre);

        System.out.println("La longitud de " + nombre + " = " + longitud);
    }
}
