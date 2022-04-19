package com.javaex.practice;

public class EX06 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

			if ((i % 5 == 0) && (i % 7 == 0)) {
				System.out.print(i + " ");
			} // 5의 배수, 7의 배수
		}
		System.out.println("");

	}

}
