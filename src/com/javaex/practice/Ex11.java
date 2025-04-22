package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		int sum = 0; // 초기화
		
		if(num % 2 == 0) {
			for(int i = 2; i<=num; i=i+2) { // i를 2로 초기화, num이하로 반복, i(4)=i(2)+2
				sum = sum+i; // sum(4) = sum(0)+i(4)
			}
		
		}else {
			for(int i = 1; i<=num; i=i+2) { // i를 1로 초기화, num이하로 반복, i(3)=i(1)+2
				sum = sum+i; // sum(3) = sum(0)+i(3)
			}
		}
		
		System.out.println("결과값: "+ sum);
		
		
		sc.close();
		
		
	}
}
