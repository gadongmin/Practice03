package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {

		int x,y;
		for(x=0; x<4; x++) {// x를 0으로 초기화, x가 4미만일때까지 반복, x를 1씩 증가 : 4줄
			for(y=2; y>=0; y--) {// y를 2로 초기화, y가 0이상이나 같을때까지 반복, y를 1씩 감소 : 3개
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
