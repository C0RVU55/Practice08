package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3); //새 주소값
		Point p2 = new Point(2, 3); //새 주소값
		Point p3 = new Point(5, 3); //새 주소값
		Point p4 = p1; //p4에 p1의 주소값 대입
		
		System.out.println(p1 == p2); //주소값 비교 --> 다름
		System.out.println(p2 == p3); //다름
		System.out.println(p3 == p4); //다름
		System.out.println(p4 == p1); //같음		
		System.out.println(p1.equals(p2)); 
		System.out.println(p4.equals(p1));
		
		//Point에서 equals()를 재정의하지 않았기 때문에 Object에 있는 equals 갖다 씀. 
		//"값이 같으면 같다"로 정의돼 있지 않아서 p1과 p2는 다른 걸로 처리됨.
	}

}


