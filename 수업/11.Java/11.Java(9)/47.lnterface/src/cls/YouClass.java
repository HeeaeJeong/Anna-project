package cls;

import inter.MyInterface;
import inter.YouInterface;

public class YouClass implements MyInterface, YouInterface{

	@Override
	public void func() {
		System.out.println("YouClass func()");
	}

	@Override
	public void method() {		
		System.out.println("YouClass method()");
	}

}