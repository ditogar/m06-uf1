package uf1.p1.ex2;

import java.io.File;

public class Ex2 {
    public static void main(String[] args) {
        File[] roots = File.listRoots();

        if (roots != null && roots.length > 0) {
            System.out.println("Unitats de disc disponibles:");
            for (File root : roots) {
                System.out.println(root.getAbsolutePath());
            }
        }
    }
}
