package uf1.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class E6 {
    public static void main(String[] args) {
        Stream<Alumne> alumnes;
        ArrayList<String> moduls = new ArrayList<>(List.of("M1", "M2"));
        ArrayList<String> modul = new ArrayList<>(List.of("M1"));
        Alumne alumne1 = new Alumne("Nom1", "Cog1", "DAM", moduls);
        Alumne alumne2 = new Alumne("Nom2", "Cog2", "ASIX", modul);
        Alumne alumne3 = new Alumne("Nom3", "Cog3", "SMIX", modul);

        alumnes = Stream.of(alumne1, alumne2, alumne3);
        alumnes.filter(a -> a.getModuls().size() >= 2).forEach(System.out::println);
    }
}
