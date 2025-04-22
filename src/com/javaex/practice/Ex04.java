package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		for(int i=1; i<5; i++) {// i를 1로 초기화, i가 5미만일때까지 반복, i는 1씩증가 : 1,2,3,4
			System.out.println(i);
		}

		System.out.println("===================");
		
		for(int i=10; i>0; i=i-2) {// i를 10으로 초기화, i가 0초과일때까지 반복, i는 i-2 : 10,8,6,4,2
			System.out.println(i);
		}
		
	}

}
