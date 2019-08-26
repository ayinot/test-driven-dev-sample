package com.ocap.TddSample;

public class StringCalculator {

	public static final int add(String numbers) {
		
		int returnValue = 0; 
		
		String[] numberArray = numbers.split(",|n");
		for (String number : numberArray) {
			if(!number.trim().isEmpty()){
				returnValue+= Integer.parseInt(number);
			}
		}
		return returnValue;
	}
}
