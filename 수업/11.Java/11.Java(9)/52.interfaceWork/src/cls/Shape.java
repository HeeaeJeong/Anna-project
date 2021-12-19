package cls;

public abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}
	Shape(Point p) {
		this.p = p;
	}

	public abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
}
