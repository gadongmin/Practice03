package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int num = sc.nextInt();
		int result = 0;
		for(int i=0; i <=num; i++) {
			if(i % 5 == 0) {
				result = result +i;
			}
		}
		System.out.print("5의 배수의 개수: " + (int)num / 5);
		System.out.println("");
		System.out.print("5의 배수의 합: " + result);
		
		
		sc.close();

	}

}
