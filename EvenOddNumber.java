package com.bridgelabz.practice_problems;

public class EvenOddNumber {


	static int arr[] = {1,2,3,4,5,6,7};
	
	public static void main(String[] args) {
		System.out.println("Welcome Even and Odd number program");
		
		EvenNumber();
		OddNumber() ;
	}
		
		public static void EvenNumber() {
		System.out.println("Even number in array ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i] + " ");
			}
		}
		}
		public static void OddNumber() {
			
			System.out.println("odd number in array ");
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] % 2 != 0) {
					System.out.println(arr[j] + " ");
				}
			}
		}
}
