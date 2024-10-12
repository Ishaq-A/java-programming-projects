package com.amanishaq;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6\\Dir7");
//            Files.createDirectories(dirToCreate);

//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);

            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1\\file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last Modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attributes.size());
            System.out.println("Last modified = " + attributes.lastModifiedTime());
            System.out.println("Created = " + attributes.creationTime());
            System.out.println("Is directory " + attributes.isDirectory());
            System.out.println("Is regular file = " + attributes.isRegularFile());

        } catch(IOException e) {
            e.getMessage();
        }

    }
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//        System.out.println();
//
////        Path filePath = FileSystems.getDefault().getPath("files","file1.txt");
//        Path filePath = Paths.get(".", "files", "file1.txt");
//        printFile(filePath);
//        System.out.println();
//
//        filePath = Paths.get("D:\\My Documents Folder\\Java Projects\\OutThere.txt");
//        printFile(filePath);
//        System.out.println();
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//        System.out.println();
//
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "file1.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//        System.out.println();
//
//        Path path3 = FileSystems.getDefault().getPath("thisfiledoesntexist.txt");
//        System.out.println(path3.toAbsolutePath());
//        System.out.println();
//
//        Path path4 = Paths.get("D:\\Test\\ING", "abcdef", "whatever.txt");
//        System.out.println(path4.toAbsolutePath());
//        System.out.println();
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
//        System.out.println();
//        System.out.println("Exists = " + Files.exists(path4));
//    }
//
//    private static void printFile(Path path) {
//        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while((line = fileReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
