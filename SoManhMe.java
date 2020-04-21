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

	public static boolean soManhMe(int number) {
		for (int i = 2 ; i <= Math.sqrt(number); i++) {

			if (soNguyenTo(i) == true) {
				if (number % i == 0) {
					if (number % Math.pow(i, 2) == 0) {
						return true;
					}
				}
			}
		}
		return false;

	}
}
