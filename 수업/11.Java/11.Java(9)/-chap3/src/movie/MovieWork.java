package movie;

public class MovieWork extends Movie{
	
	private int cinematic;	// ��ǰ��
	private int popular;	// ���߼�
	private int scenario;	// �ó�����
		
	public MovieWork(String title, int director, int acter, int cinematic, int popular, int scenario) {
		super(title, director, acter);
		this.cinematic = cinematic;
		this.popular = popular;
		this.scenario = scenario;
	}

	@Override 
	public void display() { //���⸦ �����ϼ���. 
		
		int total = director + acter + cinematic + popular + scenario;
		String result = "";
		
		System.out.println("��ȭ����:" + title);
		System.out.printf("����:%d, ���:%d, ��ǰ��:%d, ���߼�:%d, �뺻:%d\n", director, acter, cinematic, popular, scenario);
		System.out.printf("��ȭ���� :%d\n", total);
		
		if (total >= 15)
			result = "�١١١١�";
		else if (total >= 12)
			result = "�١١١�";
		else if (total >= 10)
			result = "�١١�";
		else
			result = "�١�";
		
		System.out.println("��ȭ���� : " + result);
		
	}
}
