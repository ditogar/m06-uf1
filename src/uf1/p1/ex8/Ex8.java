package uf1.p1.ex8;

import java.io.File;
import java.nio.file.Path;

public class Ex8 {
    File file = new File("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p1\\assets\\test.txt");
    Path path = file.toPath();
    File backToFile = path.toFile();
}
