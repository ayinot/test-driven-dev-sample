package com.ocap.TddSample;

public class StringCalculator {

	public static final int add(String numbers) {
		
		int returnValue = 0; 
		
		String[] numberArray = numbers.split(",");
		if(numberArray.length >2) {
			throw new RuntimeException("upto 2 numbers seperated by , are only allowed");
		}else {
			for (String number : numberArray) {
				if(!number.trim().isEmpty()){
					returnValue+= Integer.parseInt(number);
				}
			}
		}
		return returnValue;
	}
}
