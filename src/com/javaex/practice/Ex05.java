package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		int i = 1; // i를 1로 초기화
		boolean flag = true; // 변수를 항상 진실
		
		while(flag) { // 변수반복
			if(i>=5) { // i가 5이하일때까지 반복
				flag = false; // 5일떄 아웃
			}
			System.out.println(i);
			i=i+1; // 1,2,3,4,5
		}
	
	}

}
