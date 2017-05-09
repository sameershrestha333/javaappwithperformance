package com.javaconceptoftheday.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile1 {

	public static void main(String[] args) {
		int countChar = 0, countWord = 0, countLine = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("/home/sameer/inputFile1"))) {
			// getting first line
			String currentLine = br.readLine();
			while (currentLine != null) {
				countLine++;

				// count the number of words in string
				String[] strArray = currentLine.split("\\s");
				countWord += strArray.length;

				// count the number of character in string
				for (String str : strArray) {
					countChar += str.length();
				}

				// reading next line
				currentLine = br.readLine();

			}
			// Printing charCount, wordCount and lineCount

			System.out.println("Number Of Chars In A File : " + countLine);

			System.out.println("Number Of Words In A File : " + countWord);

			System.out.println("Number Of Lines In A File : " + countChar);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
