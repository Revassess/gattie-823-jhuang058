package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {

		int sum = 0;

		try {
			for (int i : arr) {
				sum += i;
			}

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return sum;
		
	}

	public static void main(String[] args) {
		int[] ar = { 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 };
		IterateAndSum(ar);
	}
}
