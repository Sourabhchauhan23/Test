package com.core.java.interview;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text");
		
		text= scan.nextLine();
		scan.close();
		
		for(int i=(text.length()-1); i>=0; i--) {
			
			System.out.print(text.charAt(i));
		}

	}

}
