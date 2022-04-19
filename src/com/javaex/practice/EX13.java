package com.javaex.practice;

import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("숫자를 입력하세요:");
		int num = input.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("합계:" + sum);
		input.close();
	}

}
