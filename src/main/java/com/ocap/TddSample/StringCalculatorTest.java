package com.ocap.TddSample;

import org.junit.Assert;
import org.junit.Test;
import com.ocap.TddSample.StringCalculator;

public class StringCalculatorTest {
	
	
	@Test
	public final void twoNumbersNoException() {
		StringCalculator.add("1,2");
		Assert.assertTrue(true);
	}
	
	@Test(expected = RuntimeException.class)
	public final void nonNumberException() {
		StringCalculator.add("1,X");
	}
	
	@Test
	public final void emptyStringReturnZero() {
		Assert.assertEquals(0, StringCalculator.add(" "));
	}
	
	@Test 
	public final void oneNumberReturnSameNumber() {
		Assert.assertEquals(3,StringCalculator.add("3"));
	}
	
	@Test
	public final void twoNumbersReturnSum() {
		Assert.assertEquals(10,StringCalculator.add("5,5"));
	}
	
	@Test
	public final void anyNumbersReturnSum() {
		Assert.assertEquals(12, StringCalculator.add("1,2,3,6"));
	}
	
	@Test
	public final void newLineBtwnNumbersReturnSum() {
		Assert.assertEquals(12, StringCalculator.add("1n2,3,6"));
	}
	
	@Test
	public final void differentDelimitersToSeperateNumbers() {
		Assert.assertEquals(12, StringCalculator.add("//;n3;6;3"));
	}
}
