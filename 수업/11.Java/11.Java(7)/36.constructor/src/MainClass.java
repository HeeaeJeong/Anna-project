public class MainClass {

	public static void main(String[] args) {
		/*
			constructor : 	������			
							��ü �����ÿ� ȣ��
							�޼ҵ�
							Ŭ������� ����
							return ���� ����
							overload�� �����ϴ�
							������ �����ϴ�.
							������ ȣ���� �Ұ����ϴ�.
			
			destructor : 	�Ҹ��� <- X   ������ �÷���
		*/
		
		int array[] = { 11, 22, 33 };		
	//	MyClass cls = { 11, "ȫ�浿" };
		
	//	MyClass cls = new MyClass();
	//	MyClass cls = new MyClass( 1 );
		MyClass cls = new MyClass(2, "hello");
		System.out.println(cls);		
		MyClass t = cls.getThis();
		System.out.println(t);
		
		MyClass cls1 = new MyClass();
		System.out.println(cls1);
		MyClass t1 = cls1.getThis();
		System.out.println(t1);

	}
}




