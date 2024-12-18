package uf1.p3.ex8;

import uf1.p3.Alumne;

import java.util.*;
import java.util.stream.Stream;

public class Ex8 {
    public static void main(String[] args) {
        ArrayList<String> moduls = new ArrayList<>(List.of("M1", "M2"));
        ArrayList<String> modul = new ArrayList<>(List.of("M1"));
        Alumne alumne1 = new Alumne("Nom1", "Cog323", "DAM", moduls);
        Alumne alumne2 = new Alumne("Nom1", "Cog2", "ASIX", modul);
        Alumne alumne3 = new Alumne("Nom3", "Cog1", "SMIX", modul);

        List<Alumne> alumnes = Arrays.asList(alumne1, alumne2, alumne3);

        alumnes.sort((a1, a2) -> {
            int compareNom = a1.getNom().compareToIgnoreCase(a2.getNom());
            if (compareNom != 0) {
                return compareNom;
            }
            return a1.getCognom().compareToIgnoreCase(a2.getCognom());
        });

        alumnes.stream().forEach(System.out::println);

        Stream<Alumne> alumnesStream = Stream.of(alumne1, alumne2, alumne3);
        alumnesStream.sorted(Comparator.comparing(Alumne::getNom, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(Alumne::getCognom, String.CASE_INSENSITIVE_ORDER)).forEach(System.out::println);
    }
}
