package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(int y=1; y<=num; y++) {// y를 1로 초기화, y가 변수이하일때까지 반복, y는 1씩 증가 : 1,2,3,4,5,6,7
			for(int x=1; x<=y; x++) {// x를 1로 초기화, x가 y이하일때까지 반복, x는 1씩 증가
				System.out.print(y);
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
