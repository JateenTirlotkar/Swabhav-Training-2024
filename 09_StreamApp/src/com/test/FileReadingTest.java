package com.test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro\\09_StreamApp\\src\\com\\test\\Untitled 1");
		
		
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\Aurionpro\\09_StreamApp\\src\\com\\test\\myfile");

		
		int ch;
		while ((ch=fileInputStream.read())!=-1)	{
			fileOutputStream.write(ch);
//			System.out.print((char)ch);
		}	
		System.out.println("File Copied Succesfully");
		fileInputStream.close();
		
	}

}
