package uf1.p2;

import java.io.IOException;
import java.nio.file.Path;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        String path = "src/f1";

        Path p1 = Path.of(path);
        Path p2 = p1.resolve("p1/ex1/ex1.java");
        System.out.println(p2);
    }
}
