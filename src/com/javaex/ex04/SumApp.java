package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		// 코드를 작성하세요
		String[] nArr = numLine.split(" "); // 숫자를 공백으로 나눠서 배열에 넣음.

		for (int i = 0; i < nArr.length; i++) {
			sum = sum + Integer.parseInt(nArr[i]); // String배열에 들어간 숫자를 정수로 형변환해서 합계 구함.
		}

		System.out.println("합:" + sum);

		sc.close();
	}

}
