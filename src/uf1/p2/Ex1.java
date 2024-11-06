package uf1.p2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex1 {
    public static void main(String[] args) {
        String path = "/home/46948549y/IdeaProjects/m06-uf1-p1/src/uf1/p1/test";

        Path p = Path.of(path);
        try {
            p.toRealPath();
            System.out.println("Existeix la ruta " + p);
        } catch (Exception e) {
            System.out.println("No existeix la ruta " + p);
        }
    }
}
