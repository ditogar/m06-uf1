package uf1.p1.ex3;

import java.nio.file.*;

public class Ex3 {
    public static void main(String[] args) {
        FileSystem fileSystem = FileSystems.getDefault();
        for (Path root : fileSystem.getRootDirectories()) {
            System.out.println(root.toString());
        }
    }
}
