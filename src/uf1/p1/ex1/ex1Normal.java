package uf1.p1.ex1;

import java.io.File;

public class ex1Normal {
    public static void main(String[] args) {
        File file = new File("/home/46948549y/Baixades");
        if (file.isDirectory()) {
            handleFiles(file);
        } else System.out.println("No és un directori.");
    }
    private static void handleFiles(File file) {
        if (file.isDirectory()) {
            System.out.println("- Directory: " + file.getName());
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    handleFiles(f);
                }
            }
        } else System.out.println("- File: " + file.getName());
    }
}