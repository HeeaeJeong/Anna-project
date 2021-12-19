package main;

import health.HealthRate;

public class MainClass {

	public static void main(String[] args) {

		HealthRate hr = new HealthRate("홍길동", 168, 45);
		hr.prn();
		HealthRate hr2 = new HealthRate("일지매", 168, 90);
		hr2.prn();
	}

}