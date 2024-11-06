package uf1.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class E4 {
    public static void main(String[] args) {
        ArrayList<String> moduls = new ArrayList<>(List.of("M1", "M2"));
        Alumne alumne1 = new Alumne("Nom1", "Cog1", "DAM", moduls);
        Alumne alumne2 = new Alumne("Nom2", "Cog2", "DAM", moduls);
        Alumne alumne3 = new Alumne("Nom3", "Cog3", "DAM", moduls);

        Stream<Alumne> alumnes;

        alumnes = Stream.of(alumne1, alumne2, alumne3);
        alumnes.forEach(System.out::println);
        alumnes = Stream.of(alumne1, alumne2, alumne3);
        alumnes.forEach(n -> System.out.println(n));
    }
}
