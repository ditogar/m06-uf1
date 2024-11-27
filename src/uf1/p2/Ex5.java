package uf1.p2;

import java.nio.file.Files;
import java.nio.file.Path;

public class Ex5 {
    public static void main(String[] args) {
        Path source = Path.of("/home/46948549y/IdeaProjects/m06-uf1-p1/src/uf1/p2/test/prova/test.txt");
        Path target = source.getParent();
        try {
            if (Files.exists(target.resolve(source.getFileName()))) {
                target = target.resolve(source.getFileName().toString().replace(".txt", "_backup.txt"));
            } else target = target.resolve(source.getFileName());
            Files.copy(source, target);
        } catch (Exception e) {
            System.out.println("No són rutes correctes. " + e);
        }
    }
}
