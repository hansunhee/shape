package shapeExcersice;

public class ColorPoint extends Point{

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
}
