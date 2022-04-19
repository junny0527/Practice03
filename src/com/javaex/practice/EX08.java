package com.javaex.practice;

public class EX08 {

	public static void main(String[] args) {
		int i;
		int j;

		for (i = 2; i <= 9; i++) {
			for (j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j));
				if (i * j < 10)
					System.out.print(" \t");
				// \t:수평탭,i*j=10보다 작음
				else
					System.out.print("\t");
			}
			System.out.println("");
		}

	}

}
