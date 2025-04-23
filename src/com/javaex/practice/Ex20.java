package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("      [숫자맞추기게임 시작]");
		System.out.println("===========================");
				
		while(true) {
			System.out.print(">> ");
			int num = sc.nextInt();
			
			if(num == 29) {
				System.out.println("맞았습니다.");
				System.out.println("게임을 종료하시겠습니까?(y/n) >> ");
				String botten = sc.nextLine();
				break;
			}
			
			if(num > 29) {
				System.out.println("더 낮게");

			}else if(num < 29) {
				System.out.println("더 높게");
			}
			
		}
		System.out.println("===========================");
		System.out.println("      [숫자맞추기게임 종료]");
		System.out.println("===========================");
	}
	

}
