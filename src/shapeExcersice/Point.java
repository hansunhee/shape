package shapeExcersice;

public class Point implements Visible, Drawable{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public void draw() {
		System.out.println("좌표[x=" + x + ", y=" + y +"]에 점을 그렸습니다.");
	}
	@Override
	public void visible(boolean visible) {
		if(visible==true){
			draw();
		}else{
			System.out.println("좌표[x=" + x + ", y=" + y +"]에 점을 지웠습니다.");						
		}
	}
	
	
}
