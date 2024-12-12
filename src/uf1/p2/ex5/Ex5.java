package uf1.p2.ex5;

import java.nio.file.Files;
import java.nio.file.Path;

public class Ex5 {
    public static void main(String[] args) {
        Path source = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\prova");
        Path target = source.getParent().resolve(source.getFileName() + "-backup");
        try {
            Files.createDirectory(target);
            Files.copy(source, target);
        } catch (Exception e) {
            System.out.println("Ja existeix el directori");
        }
    }
}
