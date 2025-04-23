package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		int sum = 0; // 초기화
		
		if(num % 2 == 0) {// 짝수일때
			for(int i = 2; i<=num; i=i+2) { // i를 2로 초기화, num이하로 반복, i=i(2)+2 i가 2이여서 짝수로 계산
				sum = sum+i; // sum(4) = sum(0)+i(4)
			}
		
		}else {// 홀수일때
			for(int i = 1; i<=num; i=i+2) { // i를 1로 초기화, num이하로 반복, i=i(1)+2 i가 1이여서 홀수로 계산
				sum = sum+i; // 
			}
		}
		
		System.out.println("결과값: "+ sum);
		
		
		sc.close();
		
		
	}
}
