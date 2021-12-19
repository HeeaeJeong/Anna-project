package cls;

import inter.PrintInterface;

public class NameCard {
	String name;
	String phone;
	String email;
	
	// interface
	PrintInterface printInterface;
	
	public NameCard(String name, String phone, String email) {		
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public void setPrintCard(PrintInterface p) {
		printInterface = p;
	}
	
	public void print() {
		printInterface.print(this);
	}
			
}
