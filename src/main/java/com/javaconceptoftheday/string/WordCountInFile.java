package com.javaconceptoftheday.string;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordCountInFile {

	public static void main(String[] args) {
		int countChar = 0, countWord = 0, countLine = 0;

		try (BufferedReader br = new BufferedReader(new FileReader("InputFile.txt"))) {

			// Initializing the count of char, word, line to 0.
			// Reading the first line into currentLine
			String currentLine = br.readLine();
			System.out.println(currentLine);
			while (currentLine != null) {
				// Updating the lineCount
				countLine++;
				// operation for counting word
				String[] strChar = currentLine.trim().split("\\s");
				// int size = strChar.length;
				countWord += strChar.length;
				//operation for counting character
				for(String str:strChar){
						countChar+=str.length();
				}
				
				
				// Reading next line into currentLine
				currentLine = br.readLine();
			}
			System.out.println("Number Of Lines In A File : " + countLine);
			System.out.println("Number Of words In A File : " + countWord);
			System.out.println("Number Of character In A File : " + countChar);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
