package mycls;

public class MyClass {
	/*
	Encapsulation == ���м�, ĸ��ȭ
	����� ���ؼ� �ܺ� ���� ����(����, �б�����, ��뿩��)
	
	���� ������
	private : ��������
	public : ��������
	protected : ��ӿ� ���� ��ȣ
*/
	
	private int number;
	public String name;
	protected double height;
/*
	public void setNumber(int number) {	// setter
	this.number = number;
	}
*/
	public int getNumber() {	// getter
	return this.number;
}

	// ������� : 90% private
	// ����޼ҵ� : 90% public

}
