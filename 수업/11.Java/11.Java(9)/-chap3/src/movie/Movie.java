package movie;

public class Movie {
	String title; 	// ��ȭ���� - �������
	int director; 	// �������� - �������
	int acter; 		// ������� - �������

	public Movie(String title, int director, int acter) {
		this.title = title;
		this.director = director;
		this.acter = acter;
	}

	public void display() {
		int total = director + acter;
		String result = "";
		
		System.out.printf("��ȭ����:%s\n", title);
		System.out.printf("����:%d, ���:%d\n", director, acter);
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
