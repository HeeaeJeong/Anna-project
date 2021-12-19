package health;

public class HealthRate extends Health {

	public HealthRate(String name, double height, double weight) {
		super(name, height, weight);		
	}

	// ǥ��ü��
	public double standardHealth() {
		return (height - 100) * 0.9;
	}
	
	// �񸸵�
	public String rateCheck() {
		
		double res = (weight - standardHealth()) / standardHealth() * 100;
		
		if(res < 10) 					return "����";
		else if(res >= 10 && res < 20) 	return "��ü��";
		else 							return "��";				
	}

	@Override
	public void prn() {		
		super.prn();		
		System.out.println(rateCheck() + "�Դϴ�. ");
	}
	
}







