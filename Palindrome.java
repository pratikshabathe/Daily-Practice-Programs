package com.bridgelabz.practice_problems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int org_num = num;
	                                                                  //number = 1234
	int rev = 0;                                                     //remainder = 1234 % 10 = 4
	while(num!=0) {                                                 //reverse = 0 * 10 + 4 = 0 + 4 = 4
		rev=rev*10 + num%10;                                       //number = 1234 / 10 = 123
		num = num /10;
	}
	if(org_num == rev) {
		System.out.println(org_num + " number is palindrom");        // number = 123
	}else {                                                          // 123 % 10 = 3
		System.out.println(org_num + " number is not palindrom");    // 4 * 10 + 3 = 40 + 3 = 43
	}                                                                // 123 / 10 =12
	}
}
