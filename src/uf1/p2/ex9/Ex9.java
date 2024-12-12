package uf1.p2.ex9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        Path p = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\0_palabras_todas_no_conjugaciones.txt");
        Path senarFile = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\linies_senars.txt");
        Path parellFile = Path.of("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p2\\test\\linies_parells.txt");

        try (BufferedReader br = Files.newBufferedReader(p);
             BufferedWriter senarWriter = Files.newBufferedWriter(senarFile);
             BufferedWriter parellWriter = Files.newBufferedWriter(parellFile)) {
            int index = 1;
            String line = null;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                if (index % 2 == 0) {
                    parellWriter.write(line + "\n");
                } else senarWriter.write(line + "\n");
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
