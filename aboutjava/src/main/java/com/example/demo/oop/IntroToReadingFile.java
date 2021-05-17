package com.example.demo.oop;

import java.io.*;

public class IntroToReadingFile {
    public static void readTheFile(File file) throws IOException {

        try {
            FileReader reader = new FileReader(file);
            try {
                BufferedReader bufferedReader = new BufferedReader(reader);
                String fileContent;
                while ((fileContent = bufferedReader.readLine()) != null) {
                    System.out.println(fileContent);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
/*
public boolean exists()       // Tests if this file/directory exists.
public long length()          // Returns the length of this file.
public boolean isDirectory()  // Tests if this instance is a directory.
public boolean isFile()       // Tests if this instance is a file.
public boolean canRead()      // Tests if this file is readable.
public boolean canWrite()     // Tests if this file is writable.
public boolean delete()       // Deletes this file/directory.
public void deleteOnExit()    // Deletes this file/directory when the program terminates.
public boolean renameTo(File dest) // Renames this file.
public boolean mkdir()        // Makes (Creates) this directory.
 */