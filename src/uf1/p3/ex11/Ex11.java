package uf1.p3.ex11;

import uf1.p3.Alumne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex11 {
    public static void main(String[] args) {
        ArrayList<String> moduls1 = new ArrayList<>(List.of("M1"));
        ArrayList<String> moduls2 = new ArrayList<>(List.of("M1", "M2"));
        ArrayList<String> moduls3 = new ArrayList<>(List.of("M1", "M2", "M3"));

        Alumne alumne1 = new Alumne("Nom1", "Cog1", "DAM", moduls2);
        Alumne alumne2 = new Alumne("Nom2", "Cog2", "DAM", moduls1);
        Alumne alumne3 = new Alumne("Nom3", "Cog3", "DAM", moduls3);

        Stream<Alumne> alumnes = Stream.of(alumne1, alumne2, alumne3);
        Stream<Alumne> alumnesSorted = alumnes.sorted((a1, a2) -> Integer.compare(a1.getModuls().size(), a2.getModuls().size()));
        alumnesSorted.forEach(System.out::println);
    }
}
