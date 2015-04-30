package shapeExcersice;

public abstract class Shape implements Visible{
	private String color;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double calculateArea();
	
}
