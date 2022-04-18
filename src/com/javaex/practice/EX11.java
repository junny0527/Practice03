package com.javaex.practice;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int a = input.nextInt();
		int b = 0;
		
		if(a%2 == 0) { //짝수 조건식
			for(int i=0; i<=a; i++) {
				b += i;
			}
		} else {
			for(int i=1; i<=a; i++) { //홀수조건식
				b += i;
			}
		}
		
		System.out.println("결과값: " + b);
		
		input.close();
	}
	

}
