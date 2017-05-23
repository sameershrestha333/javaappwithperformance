package com.javaconceptoftheday.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Java Program To Find The Most Repeated Word In Text File
 * 
 * @author sameer
 *
 */
public class RepeatedWordInFile {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("InputFile.txt"))) {
			// get the first line
			String currentLine = br.readLine();
			while (currentLine != null) {
				String[] strArray = currentLine.split("\\s");

				for (String str : strArray) {
					if (map.containsKey(str)) {
						map.put(str, map.get(str) + 1);
					} else {
						map.put(str, 1);
					}
				}

				// reading the next line
				currentLine = br.readLine();

			}
			// generating keys
			Set<String> inputString = map.keySet();
			for (String str : inputString) {
				if (map.get(str) > 1) {
					System.out.println(str + " : " + map.get(str));
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
