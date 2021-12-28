package mul.camp.a.dto;

public class HumanDto {

	private String job;
	private int age;
	
	public HumanDto() {
	}

	public HumanDto(String job, int age) {
		super();
		this.job = job;
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "HumanDto [job=" + job + ", age=" + age + "]";
	}
	
}
