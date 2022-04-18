package com.javaex.practice;

public class EX09 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1; i<=10; i++) {
			for(j=i; j<i+10; j++) {
				System.out.print(j); 
				//j를출력하면서 i를 10개씩 j로인해 숫자를 올림
				
				if(j<10) { System.out.print(" \t");
				}else {System.out.print("\t");
				
				}
			}
			System.out.println("");

		}

	}
}