package uf1.p2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        String path = "src/uf1";

        Path p = Path.of(path);
        try {
            p.toRealPath();
            System.out.println("Existeix la ruta " + p);
        } catch (Exception e) {
            Files.createDirectory(p);
            System.out.println("No existeix la ruta " + p +"\nS'ha creat el directori");
        }
    }
}
