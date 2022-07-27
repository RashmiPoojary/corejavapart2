package com.java.file;
import java.io.BufferedReader;
import java.io.FileReader;
public class CountFileExample {
	public static void main(String[] args) throws Exception {
		int charcount = 0;
        int wordcount = 0;
        int linecount = 0;
		FileReader fr= new FileReader ("D:\\xyz.txt");
		BufferedReader br1=new BufferedReader (fr);
		String currentLine=br1.readLine();
		while(currentLine!=null) {
		linecount++;
		String[] words=currentLine.split(" ");
		 wordcount = wordcount+words.length; 
		for(String word :words) {
		charcount=charcount+word.length(); 
		}
		currentLine=br1.readLine();
		System.out.println("the number of words..."+wordcount);
		System.out.println("the number of characters ..."+charcount);
		System.out.println("the number of line..."+linecount);
		br1.close();
	}
	}

	int charCount = 0;
	        int wordCount = 0;
	        int lineCount = 0;
}
