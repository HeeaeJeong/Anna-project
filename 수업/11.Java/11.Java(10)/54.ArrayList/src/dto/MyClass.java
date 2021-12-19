package dto;

public class MyClass {
	private int number;
	private String name;
	private double height;
	
	public MyClass() {
	}
	public MyClass(int number, String name, double height) {
		super();
		this.number = number;
		this.name = name;
		this.height = height;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
	//	return "MyClass [number=" + number + ", name=" + name + ", height=" + height + "]";
		System.out.println("number:" + number + ", name:" + name + ", height:" + height);
		return "";
	}
}

