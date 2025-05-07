package com.javaex.practice;

import java.util.Scanner;

public class Ex16_1 {

	public static void main(String[] args) {

		int num;
		int sum = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0) {
				sum = sum + i;

				count++;
			}
		}
		
		System.out.println("5의 배수의 개수: " + count++);
		System.out.println("5의 배수의 합: " + sum);
		sc.close();

	}

}
