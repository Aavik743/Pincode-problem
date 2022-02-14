package com.bl.pin;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pincode {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 6 digit PIN code: ");
		String pin = sc.nextLine();
		
		boolean isPin = Pattern.matches("[0-9]{3}\s+[0-9]{3}", pin);
		
		if(isPin) {
			System.out.println("Valid Pincode");
		}	
		else {
			System.out.println("Invalid Pincode");
		}
	}

}
