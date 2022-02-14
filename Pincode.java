package com.bl.pin;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pincode {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 6 digit PIN code: ");
		String pin = sc.nextLine();
		
		boolean isPin = Pattern.matches("^![A-Z~!@#$%^&*()_.+=-]+[0-9]{6}", pin);
		
		if(isPin) {
			System.out.println("Valid Pincode");
		}	
		else {
			System.out.println("Invalid Pincode");
		}
	}

}
