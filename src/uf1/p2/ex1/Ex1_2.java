package uf1.p2.ex1;

import java.nio.file.Path;

public class Ex1_2 {
    public static void main(String[] args) {
        Path p = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\prova\\test.txt");
        try {
            System.out.println(p.toRealPath());
        } catch (Exception e) {
            System.out.println("No existeix");
        }
    }
}
