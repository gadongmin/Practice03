package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		
		System.out.print("숫자: ");
		int num1 = sc.nextInt();
		System.out.print("숫자: ");
		int num2 = sc.nextInt();
		System.out.print("숫자: ");
		int num3 = sc.nextInt();
		System.out.print("숫자: ");
		int num4 = sc.nextInt();
		System.out.print("숫자: ");
		int num5 = sc.nextInt();
		
		int max = num1;
		if(num2 > max) max = num2;
		if(num3 > max) max = num3;
		if(num4 > max) max = num4;
		if(num5 > max) max = num5;
		
		System.out.println("최대값은 " + max + " 입니다.");
		
		sc.close();

	}

}
