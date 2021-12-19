package cls;

public class Rectangle extends Shape {

	int width;
	int height;
		
	public Rectangle(int width, int height) {		
		this.width = width;
		this.height = height;
	}
	
	public boolean isSquare() {
		if(width == height) {
			return true;
		}
		return false;
	}

	@Override
	public double calcArea() {		
		return width * height;
	}

}