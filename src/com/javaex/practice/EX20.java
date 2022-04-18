package com.javaex.practice;

import java.util.Scanner;

public class EX20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 1;
        int num = (int) (Math.random() * 100) + 1;	       
        int num_enter = 0;
        int answer =  num;
      
        
		System.out.println("=======================");
		System.out.println("  [숫자 맞추기 게임 시작]");
		System.out.println(("     정답 미리보기:")+ answer);
		System.out.println("=======================");

	       
	        while (num != num_enter) {
	            System.out.print("1~100 숫자 입력:");
	            num_enter = input.nextInt();
	            if (num > num_enter) {
	                System.out.println("더 낮게");
	                count++;
	            } else if (num < num_enter) {
	                System.out.println("더 높게");
	                count++;
	            }else  {
	            	 System.out.println("정답입니다! " + count + "회 만에 맞췄어요.");
	            	 System.out.println("게임을 종료하시겠습니까? (y/n) >> ");
	            	
	            }
	        }    
	        
	        String game = input.nextLine();
		       
	       
	       
				  
				
				}
			

	}



