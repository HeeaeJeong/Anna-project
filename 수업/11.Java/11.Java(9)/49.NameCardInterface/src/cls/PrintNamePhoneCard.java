package cls;

import inter.PrintInterface;

public class PrintNamePhoneCard implements PrintInterface {

	@Override
	public void print(NameCard nc) {
		System.out.println("�̸�:" + nc.name);
		System.out.println("��ȭ��ȣ:" + nc.phone);
	}

}
