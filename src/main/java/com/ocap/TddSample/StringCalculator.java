package com.ocap.TddSample;

public class StringCalculator {

	public static final int add(String numbers) {
		String delimiter = ",|n";
		String numbersWithoutDelimiter = numbers;
		
		if(numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("//")+2;
			delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
	        numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
	    }
		
		return add(numbersWithoutDelimiter,delimiter);
	}
	
	public static final int add(String numbers, String delimiter) {
		int returnValue = 0; 
		
		String[] numberArray = numbers.split(delimiter);
		for (String number : numberArray) {
			if(!number.trim().isEmpty()){
				returnValue+= Integer.parseInt(number.trim());
			}
		}
		return returnValue;
	}
}
