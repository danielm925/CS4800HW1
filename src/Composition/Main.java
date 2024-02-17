package Composition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");
        Folder phalcon = new Folder(".phalcon");
        Folder cache = new Folder("cache");

        folder.addSubFolder(sourceFiles);
        folder.addSubFolder(includePath);
        folder.addSubFolder(remoteFiles);
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(cache);

        folder.print(" ");
    }
}

class File {
    String name;

    public String getName() {
        return name;
    }
}

class Folder {
    private final String name;
    private final List<File> files;
    private final List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        files = new ArrayList<>();
        subFolders = new ArrayList<>();
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void print(String indentation) {
        System.out.println(indentation + "Folder: " + name);

        System.out.println(indentation + "Files ->");
        for (File file : files) {
            if (file != null) {
                System.out.println(indentation + "  " + file.getName());
            }
        }

        System.out.println(indentation + "Subfolders ->");
        for (Folder subFolder : subFolders) {
            if (subFolder != null) {
                subFolder.print(indentation + "  ");
            }
        }
    }
}

