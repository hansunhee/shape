package shapeExcersice;

public class ShapeTest {
	public static void main(String[] args) {
		//1. 
		Point point=new Point();
		point.setX(2);
		point.setY(5);
		point.draw();
		
		Point point3=new Point(50, 50);
		
		point3.draw();
		point3.visible(false);
		
		ColorPoint point4=new ColorPoint(10,20,"red");
		point3.visible(true);
		point4.draw();
		
		Shape rect = new Rect(10, 5);
	    Shape circle = new Circle(7);

	    rect.calculateArea();
	    
	    rect.setColor("blue");
	    System.out.println(rect.calculateArea());
	    circle.calculateArea();
	    System.out.println(circle.calculateArea());
		
		//인터페이스테스트
		Drawable drawable=new Point(10,20);
		drawable.draw();
		
		//instanceof test
		Circle c = new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);
		
		Shape s=c;
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		
	}
}
