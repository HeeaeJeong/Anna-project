package cls;

public class ChildClass extends ParentClass {

	private double height;
	
	public ChildClass() {
	//	super();
		super(123, "hello");
		System.out.println("ChildClass ChildClass()");
	}

	public ChildClass(double height) {	
	//	super(234, "world");
		this.height = height;
	}
	
	public ChildClass(int number, String name, double height) {		
		super(number, name);
		this.height = height;		
	}
	
	
}
