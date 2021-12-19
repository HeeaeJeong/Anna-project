package health;

public class HealthRate extends Health {

	public HealthRate(String name, double height, double weight) {
		super(name, height, weight);		
	}

	// 표준체중
	public double standardHealth() {
		return (height - 100) * 0.9;
	}
	
	// 비만도
	public String rateCheck() {
		
		double res = (weight - standardHealth()) / standardHealth() * 100;
		
		if(res < 10) 					return "정상";
		else if(res >= 10 && res < 20) 	return "과체중";
		else 							return "비만";				
	}

	@Override
	public void prn() {		
		super.prn();		
		System.out.println(rateCheck() + "입니다. ");
	}
	
}







