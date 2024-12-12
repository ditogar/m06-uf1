package uf1.p1.ex6;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex6 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\diego\\OneDrive\\Escritorio\\Descargas - Acceso directo");
        if (Files.exists(path)) {
            if (Files.isSymbolicLink(path)) System.out.println("Es");
            try (Stream<Path> files = Files.list(path)) {
                files.forEach(System.out::println);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
