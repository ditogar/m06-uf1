package uf1.p1;

import java.net.URI;
import java.nio.file.*;

public class Ex4_1 {
    public static void main(String[] args) {
        String path = "/home/46948549y/IdeaProjects/m06-uf1-p1/src/uf1/p1/test/test.txt";

        // Path amb Path
        Path path1 = Path.of(path);
        checkIfExists(path1);

        // Path amb Paths
        Path path2 = Paths.get(path);
        checkIfExists(path2);

        // Path amb URI
        try {
            URI uri = new URI("file:///" + path);
            Path path3 = Paths.get(uri);
            checkIfExists(path3);
        } catch (Exception e) {
            System.out.println("Error en crear la Path amb URI " + e.getMessage());
        }

        // Path amb FileSystem
        try {
            FileSystem fileSystem = FileSystems.getDefault();
            Path path4 = fileSystem.getPath(path);
            checkIfExists(path4);
        } catch (Exception e) {
            System.out.println("Error en crear la Path amb FileSystem");
        }

    }
    private static void checkIfExists(Path path) {
        if (Files.exists(path)) {
            System.out.println("Existeix l'arxiu " + path.toAbsolutePath());
        } else System.out.println("No existeix l'arxiu " + path);
    }
}
