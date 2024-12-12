package uf1.p2.ex3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex3 {
    public static void main(String[] args) {
        Path p = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\prova\\test.txt");
        try {
            System.out.println(p.toRealPath());
        } catch (Exception e) {
            try {
                Files.createDirectory(p);
                System.out.println("S'ha generat un directori a " + p.toRealPath());
            } catch (Exception s) {
                System.out.println("Error");
            }
        }
    }
}
