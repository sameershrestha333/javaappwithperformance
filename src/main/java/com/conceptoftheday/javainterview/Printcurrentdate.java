package com.conceptoftheday.javainterview;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Printcurrentdate {

	public static void main(String[] args) {
		// To print the date in "dd MMM yyyy"
		Date date=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd MMM yyyy");
		System.out.println(dateFormat.format(date));
		
	}

}
