package com.javaex.practice;

import java.util.Scanner;

public class Ex18_1 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();

		
		for (int y = num; y >= 1; y--) {
			for (int x = y; x >= 1; x--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int y = 2; y <= num; y++) {
			for (int x = 1; x <= y; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		sc.close();

	}

}
