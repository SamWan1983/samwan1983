package com.sam.question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegex {
	final String ipReg = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPValidationRegex validator = new IPValidationRegex();
		BufferedReader br = null;
		boolean isNotFile = true;

		try {
			//read input
			br = new BufferedReader(new InputStreamReader(System.in));
			while (isNotFile) {
				System.out.print("Please provide a valid IP txt file path : ");
				String input = br.readLine();

				File file = new File(input);
				//check if file exists
				if(file.exists()) {
					isNotFile = false;
					//start filtering
					validator.filterIP(file.getAbsolutePath());
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	private boolean isValidIP(String val) {
		Pattern p = Pattern.compile(ipReg);
		Matcher m = p.matcher(val);
		
		return m.matches();
	}

	private void filterIP(String fileName) {
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String ipLine;

			while ((ipLine = br.readLine()) != null) {
				if(isValidIP(ipLine)) {
					System.out.println(ipLine+" is Valid IP");
				}else {
					System.out.println(ipLine+" is NOT Valid IP");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
