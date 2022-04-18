package com.javaex.practice;

import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("약수를 구할 숫자를 입력하세요:");
        
        // num=입력받는값, a=나누는값
        int num = input.nextInt();
        int a;
 
        for(a=1; a<=num; a++){
            if((num%a)==0){
                System.out.println(a);
                
        }
    
        input.close();

	}

 }
}