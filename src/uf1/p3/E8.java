package uf1.p3;

import java.util.*;
import java.util.stream.Stream;

public class E8 {
    public static void main(String[] args) {
        ArrayList<String> moduls = new ArrayList<>(List.of("M1", "M2"));
        ArrayList<String> modul = new ArrayList<>(List.of("M1"));
        Alumne alumne1 = new Alumne("Nom1", "Cog323", "DAM", moduls);
        Alumne alumne2 = new Alumne("Nom2", "Cog2", "ASIX", modul);
        Alumne alumne3 = new Alumne("Nom3", "Cog1", "SMIX", modul);

        List<Alumne> alumnes = Arrays.asList(alumne1, alumne2, alumne3);

        Collections.sort(alumnes, (a1, a2) -> {
            return a1.getCognom().compareToIgnoreCase(a2.getCognom());
        });

        alumnes.stream().forEach(System.out::println);
    }
}
