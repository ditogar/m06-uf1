package uf1.p2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Ex13 {
    public static void main(String[] args) {
        Path source = Path.of("/home/46948549y/IdeaProjects/m06-uf1-p1/src/uf1/p2/test/prova/test.txt");
        try (Stream<String> lines = Files.lines(source)) {
            lines.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
