package com.java.file;
import java.io.FileWriter;
public class FileWriterDemo {
	public static void main(String[] args) {
	try {
		FileWriter fw=new FileWriter("D://xyz.txt");
		fw.write("Welcome");
		fw.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
		System.out.println("success");
	}
	}

