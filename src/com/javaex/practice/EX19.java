package com.javaex.practice;

import java.util.Scanner;

public class EX19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int monney = 0;

		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			num = input.nextInt();

			if (num == 1) {
				System.out.println("금액을 입력하시면 예금이 합산됩니다");
				System.out.print("예금엑>");
				num = input.nextInt();
				monney += num;
			} else if (num == 2) {
				System.out.println("금액을 입력하시면 예금이 차감됩니다");
				System.out.print("출금엑>");
				num = input.nextInt();
				if (monney > num)
					monney -= num;
			} else if (num == 3) {
				System.out.println("잔고가 출력됩니다");
				System.out.println("잔고엑>" + monney);
			} else if (num == 4) {
				break;
			} else
				System.out.println("다시입력해주세요");
		}

		System.out.println("프로그램 종료");
		input.close();

	}

}
