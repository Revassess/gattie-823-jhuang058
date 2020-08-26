package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		
		
		String s = num+"";
		char[] c = s.toCharArray();
		int l = c.length;
		long sum = 0;
		
		for (char digit: c) {
			 int powerdigit = (int) Math.pow(Character.getNumericValue(digit), l);
			sum += powerdigit;
		}
		
			
		return sum == num;
	}
}

