package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		// 친구정보 입력 받아 Friend 객체 생성하고 배열에 3개 저장 후 출력

		Friend[] f = new Friend[3];

		Scanner sc = new Scanner(System.in);
		System.out.println("친구 3명을 등록해주세요");

		for (int i = 0; i < f.length; i++) {
			Friend ff = new Friend(sc.nextLine());
			f[i] = ff;
		}

		for (int i = 0; i < f.length; i++) {
			f[i].showInfo();
		}

		sc.close();

	}

}
