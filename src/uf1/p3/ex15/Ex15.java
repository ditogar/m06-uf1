package uf1.p3.ex15;

import uf1.p3.Alumne;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex15 {
    public static void main(String[] args) {
        ArrayList<String> moduls = new ArrayList<>(List.of("M1"));

        Alumne alumne1 = new Alumne("Nom1", "Cog1", "DAM", moduls);
        alumne1.setNota(8d);
        Alumne alumne2 = new Alumne("Nom2", "Cog2", "DAM", moduls);
        alumne2.setNota(5d);
        Alumne alumne3 = new Alumne("Nom3", "Cog3", "DAM", moduls);
        alumne3.setNota(3d);

        Stream<Alumne> alumnes = Stream.of(alumne1, alumne2, alumne3);
        Optional<Alumne> maxAlumne = alumnes.max((a1, a2) -> Double.compare(a1.getNota(), a2.getNota()));
        maxAlumne.ifPresent(System.out::println);
    }
}