package shapeExcersice;

public class Circle extends Shape implements Drawable{
	private int radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}
	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public void visible(boolean visible) {
		if(visible==true){
			draw();
		}else{
			System.out.println("원을 지웠습니다.");						
		}
	}

	@Override
	public void draw(int count) {
		System.out.println("원을 "+count+"개 그렸습니다.");		
	}
}
