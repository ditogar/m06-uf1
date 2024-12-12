package uf1.p2.ex1;

import java.nio.file.Files;
import java.nio.file.Path;

public class Ex1_1 {
    public static void main(String[] args) {
        Path p = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\prova\\test.txt");

        if (Files.exists(p)) {
            System.out.println("Existeix la ruta");
        } else System.out.println("No existeix la ruta");
    }
}
