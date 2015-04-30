package sds.icto55.oop.example;

import shapeExcersice.Circle;
import shapeExcersice.Rect;
import shapeExcersice.Shape;

/*
 * 다형성 중 오버라이딩의 예
 */
public class example3 {
	public static void main(String[] args) {
		Shape rect = new Rect(10, 5);
	    Shape circle = new Circle(7);

	    rect.setColor("blue");
	    System.out.println(rect.calculateArea());
	    circle.calculateArea();
	    System.out.println(circle.calculateArea());
	}
}
