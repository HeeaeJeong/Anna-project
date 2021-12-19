package health;

public class Health {
	String name; 	// ÀÌ¸§
	double height; 	// ½ÅÀå
	double weight; 	// ¸ö¹«°Ô

	public Health(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void prn() {
		System.out.printf("%s´ÔÀÇ Å° %d , ¸ö¹«°Ô %d ", name, (int)height, (int)weight);
	}
}