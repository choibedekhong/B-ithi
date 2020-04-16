package com.fpt.fwa.java;

import java.util.Scanner;

public class SoManhMe {
	public static boolean soNguyenTo(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Xac Dinh So Manh Me");
		Scanner scan = new Scanner(System.in);
		int j = 0;
		while (j < 100) {
			System.out.print("Vui long nhap so: ");
			int number = scan.nextInt();
			boolean ketqua = false;	
		   
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (soNguyenTo(i) == true) {
					if (number % i == 0) {
					if (number % Math.pow(i,2) == 0) {
						ketqua = true;
						break;
					}
					}
					
					else {
						ketqua = false;
					}
				
			}
			}
		  
			if (ketqua == true) {
				System.out.println(  number +" la so manh me");
			} 
			else {
				System.out.println(  number +" khong la so manh me" );
			}
		}
	}
}
