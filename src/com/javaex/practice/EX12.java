package com.javaex.practice;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = 0;
		int fac = 1;

		System.out.print("숫자를 입력하세요: ");
		x = input.nextInt();

		for (int i = x; i >= 1; i--) {
			fac = fac * i;
		}
		System.out.print("결과값: " + fac);

		input.close();
	}

}
