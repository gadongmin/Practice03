package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");

		int num = sc.nextInt();
		long result = 1;
		for(int i=1; i<=num; i++) {//1초기화, 입력된 숫자 이하로 반복, 1씩증가
			result = result*i; // 결과값이 1이면 숫다 4로 입력했을때, 4,3,2,1에 각 1씩 곱을 해준값이 결과임
		}
		System.out.println("결과값: " + result);
		
		sc.close();

	}

}
