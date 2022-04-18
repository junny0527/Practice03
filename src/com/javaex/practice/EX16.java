package com.javaex.practice;

import java.util.Scanner;

public class EX16 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int count = 0;
	        int sum = 0;
	        int a = 0;
	        int b = 0;
	        
	        System.out.print("숫자를 입력하세요 : ");
	        int j = input.nextInt();
	        
	        for (int i = 1; i < j+1; i++){
	            a = i / 5; //5로나눠서 개수를 정해줌
	            b = i - (a * 5); //5의 배수의 합
	            if (b == 0){
	                count++;
	                sum = sum + i;
	            }
	        }
	        System.out.println("5의 배수의 개수 : " + count);
	        System.out.println("5의 배수의 합 : " + sum);

	        input.close();
	}

}
