package health;

public class Health {
	String name; 	// �̸�
	double height; 	// ����
	double weight; 	// ������

	public Health(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void prn() {
		System.out.printf("%s���� Ű %d , ������ %d ", name, (int)height, (int)weight);
	}
}