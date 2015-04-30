package sds.icto55.oop.example;

import shapeExcersice.Rect;
import shapeExcersice.Shape;

/*
 * 상속 예제
 */
public class example1 {
	public static void main(String[] args) {
		//자식클래스인 Rect가 부모클래스인 Shape의 getColor() setColor() 를 사용할 수 있다.
		Shape rect=new Rect(10, 5);
		rect.setColor("yellow");
		System.out.println(rect.getColor());
	}
}
