package uf1.p2.ex4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test";

        Path p1 = Path.of(path);
        Path p2 = p1.resolve("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\prova\\test_backup.txt");
        System.out.println(p2);
    }
}
