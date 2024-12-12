package uf1.p1.ex5;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Ex5 {
    public static void main(String[] args) {
        String path = "C:\\Users\\diego\\Downloads\\home.png";

        // Path amb Path
        Path path1 = Path.of(path);
        checkIfExists(path1);


    }

    private static void checkIfExists(Path path) {
        if (Files.exists(path)) {
            System.out.println("Existeix");
            // Ruta absoluta
            System.out.println(path.toAbsolutePath());

            // Nom de l'arxiu
            System.out.println(path.getFileName());

            // Ruta del pare
            System.out.println(path.getParent());

            // Mostra tots els elements dins el directori
            try (Stream<Path> stream =  Files.list(path.getParent())) {
                stream.forEach(System.out::println);
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Unitat de disc
            System.out.println(path.getRoot());

            // Mostri si es una ruta absoluta o no
            if (path.isAbsolute()) {
                System.out.println("Es absoluta");
            } else System.out.println("Es relativa\n" + path.toAbsolutePath());
        } else System.out.println("No existeix");
    }

    private static void showOtherFilesInPath(Path path) {
        for (Path p : path) {

        }
    }
}
