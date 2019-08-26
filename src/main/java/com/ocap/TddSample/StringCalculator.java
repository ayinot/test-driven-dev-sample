package com.ocap.TddSample;

import java.util.ArrayList;
import java.util.List;

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
        List negativeNumbers = new ArrayList();
		
		String[] numberArray = numbers.split(delimiter);
		
		for (String number : numberArray) {
			if(!number.trim().isEmpty()) {
				int numberInt = Integer.parseInt(number.trim());
				if(!number.trim().isEmpty()){
					if(numberInt < 0) {
						negativeNumbers.add(numberInt);
					}	
					returnValue+= numberInt;
				}
			}
		}
		
		if(negativeNumbers.size() > 0) {
			throw new RuntimeException("Negative numbers are not allowed"+ negativeNumbers.toString());
		}
		
		return returnValue;
	}
}
