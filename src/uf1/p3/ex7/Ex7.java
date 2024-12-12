package uf1.p3.ex7;

import uf1.p3.Alumne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex7 {
    public static void main(String[] args) {
        ArrayList<String> moduls = new ArrayList<>(List.of("M1", "M2"));
        ArrayList<String> modul = new ArrayList<>(List.of("M1"));
        Alumne alumne1 = new Alumne("Nom1", "Cog1", "DAM", moduls);
        Alumne alumne2 = new Alumne("Nom2", "Cog2", "ASIX", modul);
        Alumne alumne3 = new Alumne("Nom3", "Cog3", "SMIX", modul);

        Stream<Alumne> alumnes1 = Stream.of(alumne1, alumne2, alumne3);
        Stream<String> nomAlumnes1 = alumnes1.map(Alumne::getNom).map(String::toUpperCase);

        Stream<Alumne> alumnes2 = Stream.of(alumne1, alumne2, alumne3);
        Stream<String> nomAlumnes2 = alumnes2.map(a -> a.getNom().toUpperCase());

        List<Alumne> alumnes3 = Arrays.asList(alumne1, alumne2, alumne3);

        nomAlumnes1.forEach(System.out::println);
        nomAlumnes2.forEach(System.out::println);
        alumnes3.stream().map(a -> a.getNom().toUpperCase()).forEach(System.out::println);
    }
}
