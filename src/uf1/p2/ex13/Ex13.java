package uf1.p2.ex13;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Ex13 {
    public static void main(String[] args) {
        Path input = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\0_palabras_todas_no_conjugaciones.txt");
        Path senars = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\linies_senars.txt");
        Path parells = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\linies_parells.txt");

    }

    private static void printLines(Path p) {
        try (Stream<String> lines = Files.lines(p)) {
            lines.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//    private static void separaLinies(Path input, Path parells, Path senars) {
//        try (Stream<String> lines = Files.lines(input)) {
//            int index = 1;
//            lines.forEach(l -> {
//                if (index % 2 == 0) {
//                    Files.write(parells, l);
//                } else Files.write(senars, l);
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
