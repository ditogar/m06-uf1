package uf1.p2.ex10;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        Path input = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\0_palabras_todas_no_conjugaciones.txt");
        Path output = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\0_palabras_todas_no_conjugaciones_RANDOM.txt");
        try {
            List<String> lines = Files.readAllLines(input);
            Collections.shuffle(lines);
            Files.write(output, lines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
