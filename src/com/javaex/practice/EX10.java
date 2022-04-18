package com.javaex.practice;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int big = 0;
		int num;
		
		System.out.println("숫자를 입력하세요");
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			
			num = input.nextInt();
			
			if(i==0) big = num;
			else if(num > big)  big = num;
		}
		
		System.out.println("최대은 " + big + "입니다.");
		input.close();

	}

}
