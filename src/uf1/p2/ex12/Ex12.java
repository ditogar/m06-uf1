package uf1.p2.ex12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class Ex12 {
    public static void main(String[] args) {
        Path source = Path.of("/home/46948549y/IdeaProjects/m06-uf1-p1/src/uf1/p2/test/prova");
        Path target = Path.of("/home/46948549y/IdeaProjects/m06-uf1-p1/src/uf1/p2/test/copia");

        try {
            Files.copy(source, target);
        } catch (Exception e) {
            e.printStackTrace();
        }
        copyDirectory(source, target);
    }

    private static void copyDirectory(Path source, Path target) {
        try (Stream<Path> paths = Files.list(source)) {
            paths.forEach(path -> {
                try {
                    System.out.println(path.getFileName());
                    System.out.println(target.getFileName());

                    Files.copy(path, target.resolve(path.getFileName()), StandardCopyOption.REPLACE_EXISTING);
                    if (Files.isDirectory(path)) {
                        copyDirectory(path, target.resolve(path.getFileName()));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
