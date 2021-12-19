package cls;

public class ParentClass {

	private int number;
	protected String name;
	
	public void parentMethod() {
		System.out.println("ParentClass parentMethod()");
	}

	protected int getNumber() {
		return number;
	}

	protected void setNumber(int number) {
		this.number = number;
	}	
	
}
