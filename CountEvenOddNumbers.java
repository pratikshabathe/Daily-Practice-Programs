package com.bridgelabz.practice_problems;

public class CountEvenOddNumbers {

	public static void main(String[] args) {
		
		int num = 786543;
		int even_count = 0;
		int odd_count = 0;
		
		while(num > 0) {
			int reminder = num % 10;
			if(reminder % 2 == 0) {
				even_count ++;
			}
			else {
				odd_count ++;
			}
			num = num/10;
		}
		System.out.println("Number of Even number: " +even_count);
		System.out.println("Number of odd number: " +odd_count);
	}

}
