package com.javaex.practice;

import java.util.Scanner;

public class EX14 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = input.nextInt();
		int sum = 0;
		
		
		for(int i=1; i<=num; i++) {
			sum += i;
			if(i<num) {
				System.out.print(i + "+");
				//입력한숫자까지 숫자+숫자...보여줌
			}
			else {System.out.println(i);
			
			}
		
		}
		System.out.println("합계:"+sum);
		 input.close();

	}

}
