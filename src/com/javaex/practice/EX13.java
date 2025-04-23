package com.javaex.practice;

import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");

		int num = sc.nextInt();			
		long result = 0;
		for(int i = 0; i<=num; i++) {
			result = result + i;
		}
		System.out.println("합계: " + result);
		
		sc.close();

	}

}
