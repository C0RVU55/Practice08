package com.javaex.ex08;

public class Friend {

	// 필드
	String f;

	// 생성자
	public Friend(String f) {
		this.f = f;
	}

	// 메소드 겟셋
	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	// 메소드 일반
	public void showInfo() {
		String[] ff = f.split(" ");
		String name = ff[0];
		String tel = ff[1];
		String sch = ff[2];
		System.out.println("이름:" + name + "  핸드폰:" + tel + "  학교:" + sch);
	}

}
