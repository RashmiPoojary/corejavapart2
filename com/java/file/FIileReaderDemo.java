package com.java.file;
import java.io.FileReader;
public class FIileReaderDemo {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D://xyz.txt");
		int i;
		while ((i = fr.read())!=-1)
			System.out.print((char) i);
		fr.close();
	}
}
