package com.day6;

import java.io.FileInputStream;
import java.io.IOException;

public class File_IO {
    public static void main(String[] args) {
        String filename = "D:\\Aurionpro\\04_Homework\\src\\com\\day6\\text_file"; 

        try (FileInputStream fis = new FileInputStream(filename)) {
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            boolean inWord = false;
            int byteRead;

            while ((byteRead = fis.read()) != -1) {
                charCount++;

                if (byteRead == '\n') {
                    lineCount++;
                }

                if (Character.isWhitespace(byteRead)) {
                    if (inWord) {
                        wordCount++;
                        inWord = false;
                    }
                } else {
                    inWord = true;
                }
            }

            if (inWord) {
                wordCount++;
            }

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
