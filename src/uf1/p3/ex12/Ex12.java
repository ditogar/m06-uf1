package uf1.p3.ex12;

import uf1.p3.Alumne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex12 {
    public static void main(String[] args) {
        ArrayList<String> moduls = new ArrayList<>(List.of("M1"));

        Alumne alumne1 = new Alumne("Nom1", "Cog1", "DAM", moduls);
        Alumne alumne2 = new Alumne("Nom2", "Cog2", "DAM", moduls);
        Alumne alumne6 = new Alumne("Nom2", "Cog2", "DAM", moduls);
        Alumne alumne3 = new Alumne("Nom3", "Cog3", "DAM", moduls);
        Alumne alumne4 = new Alumne("Nom1", "Cog1", "DAM", moduls);
        Alumne alumne7 = new Alumne("Nom3", "Cog3", "DAM", moduls);
        Alumne alumne5 = new Alumne("Nom1", "Cog1", "DAM", moduls);

        Stream<Alumne> alumnes = Stream.of(alumne1, alumne2, alumne3);
        alumnes.distinct().forEach(System.out::println);
    }
}
