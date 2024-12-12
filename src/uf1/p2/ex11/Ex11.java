package uf1.p2.ex11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

public class Ex11 {
    public static void main(String[] args) {
        Path p = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\0_palabras_todas_no_conjugaciones.txt");
        try {
            long size = Files.size(p);
            FileTime time = Files.getLastModifiedTime(p);
            System.out.println((size / 1024) + " Kb");
            System.out.println(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
