package com.fpt.fwa.java;

import java.util.Scanner;

public class HamMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Xac Dinh So Manh Me");
		Scanner scan = new Scanner(System.in);
		System.out.print("Vui long nhap so: ");
		int number = scan.nextInt();
		
		if (SoManhMe.soManhMe(number) == true) 
		{
			System.out.println(number +" la so manh me");
		} 
		else 
		{
			System.out.println(number +" khong la so manh me");
		}
		System.out.println("Cac so manh me nho hon: ");
		for (int i = 1 ; i < number; i ++) {
			if (SoManhMe.soManhMe(i)== true) {
				System.out.println(i);
			}
		}
	}
	
}
