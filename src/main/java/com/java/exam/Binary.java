package com.java.exam;

public class Binary {

	public static String test(int n) {
		String sample = "";
		while (n != 0) {
			if (n % 2 == 0) {
				sample += 0;
			} else {
				sample += 1;
			}
			n = n / 2;
		}
		int count = 0;
		for (int i = 0; i < sample.length(); i++) {
			if (sample.charAt(i) == '1' && sample.charAt(i + 1) == '1') {
				count++;
			}
		}

		return sample;
	}

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer(new String(test(13)));
		stringBuffer.reverse();

		System.out.println(stringBuffer);
	}

}
