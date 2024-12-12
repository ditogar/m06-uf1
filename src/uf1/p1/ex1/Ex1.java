package uf1.p1.ex1;

import java.io.File;
import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        File file = new File("/home/46948549y/Baixades");
        if (file.isDirectory()) {
            ArrayList<File> fileList = handleFiles(file);
            for (File f : fileList) {
                if (f.isDirectory()) {
                    System.out.println("- Directory: " + f.getName());
                } else if (f.isFile()) {
                    System.out.println("- File: " + f.getName());
                }
            }
        } else System.out.println("No és un directori.");
    }

    private static ArrayList<File> handleFiles(File file) {
        ArrayList<File> fileList = new ArrayList<>();
        if (file.isDirectory()) {
            File[] directory = file.listFiles();
            if (directory != null) {
                for (File i : directory) {
                    if (i.isDirectory()) {
                        fileList.add(i);
                        File[] files = i.listFiles();
                        if (files != null) {
                            for (File j : files) {
                                ArrayList<File> fileListToAdd = handleFiles(j);
                                fileList.addAll(fileListToAdd);
                            }
                        }
                    } else if (i.isFile()) {
                        fileList.add(i);
                    }
                }
            }
        }
        return fileList;
    }
}