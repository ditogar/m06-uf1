package uf1.p2.ex8;

import java.nio.file.Files;
import java.nio.file.Path;

public class Ex8 {
    public static void main(String[] args) {
        Path p = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\copia");
        try {
            Files.delete(p);
            Files.deleteIfExists(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
