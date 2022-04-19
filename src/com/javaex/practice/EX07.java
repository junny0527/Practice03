package com.javaex.practice;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int n = input.nextInt(); //입력한 숫자
		
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			} //i에 n수자까지의 표기 j에 i를 숫자만큼 복사
			System.out.println("");//공백
		}
		
		input.close();


	}

}
