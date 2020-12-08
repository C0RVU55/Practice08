package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		int num1, num2;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자 2개와 사칙연산자를 띄어서 쓰세요. 종료는 /q");
			System.out.print(">> ");
			String cal = sc.nextLine();

			if (cal.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			} else {
				String[] cArr = cal.split(" ");

				num1 = Integer.parseInt(cArr[0]);
				num2 = Integer.parseInt(cArr[2]);

				if (cArr[1].equals("+")) {
					Add sum = new Add();
					sum.setValue(num1, num2);
					System.out.println(">> " + sum.calculate());
				} else if (cArr[1].equals("-")) {
					Sub sub = new Sub();
					sub.setValue(num1, num2);
					System.out.println(">> " + sub.calculate());
				} else if (cArr[1].equals("*")) {
					Mul mul = new Mul();
					mul.setValue(num1, num2);
					System.out.println(">> " + mul.calculate());
				} else if (cArr[1].equals("/")) {
					Div div = new Div();
					div.setValue(num1, num2);
					System.out.println(">> " + div.calculate());
				} else {
					System.out.println("알 수 없는 연산입니다.");
				}
			}
		}

		sc.close();
	}
}
