package uf1.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class E5 {
    public static void main(String[] args) {
        Stream<Alumne> alumnes;
        ArrayList<String> moduls = new ArrayList<>(List.of("M1", "M2"));
        Alumne alumne1 = new Alumne("Nom1", "Cog1", "DAM", moduls);
        Alumne alumne2 = new Alumne("Nom2", "Cog2", "DAM", moduls);
        Alumne alumne3 = new Alumne("Nom3", "Cog3", "DAM", moduls);

        alumnes = Stream.of(alumne1, alumne2, alumne3);
        alumnes.forEach(n -> System.out.println("Nom " + n.getNom() + " Cognom " + n.getCognom() + " Cicle " + n.getCicle()));
    }
}
