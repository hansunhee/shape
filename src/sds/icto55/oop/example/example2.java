package sds.icto55.oop.example;

import shapeExcersice.ColorPoint;
import shapeExcersice.Point;

/*
 * 캡슐화의 예
 */
public class example2 {
	public static void main(String[] args) {
		Point a, b;
	    a = new Point(2, 3);
	    b = new ColorPoint(3, 4, "red");
	    a.draw();
	    b.draw();
	}
}
