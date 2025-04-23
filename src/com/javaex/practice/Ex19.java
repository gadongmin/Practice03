package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long pass = 0; // 반복문 밖에 설정해야 누적금액을 만들수 있다.
		
		while(true) {
			System.out.println("------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("예금액>");
				long tran1 = sc.nextLong();
				pass = pass + tran1;
			
			}else if(num == 2) {
				System.out.print("출금액>");
				long tran2 = sc.nextLong();
				pass = pass - tran2;
			
			}else if(num == 3) {
				System.out.println("잔고액> " + pass);
			
			}else if(num == 4) {
				System.out.println("프로그램 종료");
				break; // 프로그램 종료를 위해 꼭 필요한 장치

			}else {
				System.out.println("다시입력해주세요");
			}
		}
		sc.close();		
	}
}		

