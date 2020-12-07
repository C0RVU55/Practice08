package com.javaex.ex03;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// toString()을 작성 하세요
	// Point에서 toString을 재정의하지 않으면 Object에 있는 toString을 호출하게 돼서 원하는 값이 아닌 주소가 출력됨.
	@Override
	public String toString() {
		return "[포인트] x:" + x + ", y:" + y + " 입니다.";
	}

}
