
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//�л����� ������ 2�� �迭�� �Է��� �޴´�.
	//(�̸�, �������, ����, ����, ����)
	//�� �л����� ���� ���� ������ ��ģ ������?
	//�л����� ���������� ������?
	//���� ������ �ְ� ������ �����ΰ�?
	//���� ������ ���������� �����ΰ�?
	//�б޿��� 1���� �����ΰ�? �̸��� ����ض�.

	
	String[] title = {"�̸�  �������","����","����","����","����"};
	String[] name = {"������ 990322","���ѳ� 990211","ȫ�浿 990230"};
	
	int[][] score = {{90,90,90},{60,60,60},{80,80,0}};
	int arr []=new int[3];
	int kotot = 0;
	int egtot = 0;
	int matot = 0;
	
	//Ÿ��Ʋ
	System.out.println("�л����� ����");
	for(String t:title) {
		System.out.print(t+"\t");		
	}
	System.out.println();
	//�̸�,����
	for(int i = 0; i<score.length;i++) {
		System.out.print(name[i]+"\t");
		
	for(int j=0;j<score[i].length;j++) {
			System.out.print(score[i][j]+"\t");
			
			arr[j]+=score[i][j];
		}
	//���� ����
	kotot += score[i][0];
		
	//����
	int summ = 0;
	for(int j = 0; j < score[i].length; j++) {
		summ += score[i][j];
	}
		System.out.println(summ+"\t");
	}
	System.out.println("");
	
	//���� ����
	System.out.println("�л����� ���� ������ ���ΰ���?");
	System.out.println("������"+kotot+"�Դϴ�.");
	
	System.out.println("");
	
	//���� ������ �ְ� ������ ���� �ΰ���?
	System.out.println("���� ������ �ְ� ������ �����ΰ���?");

	egtot = score[0][1];
	int max = 0;
		if(score[0][1] > max) {
			max = score[0][1];
		}
	System.out.println("������ �ְ� ������" + max);
	
	System.out.println("");	
	
	//���� ������ ���������� �����ΰ�?
	System.out.println("���� ������ ���� ������ �����ΰ���?");
	matot = score[0][2];
	int min = 0;
	    if(score[0][2] < min) {
	    	min = score[0][2];
	    }
	System.out.println("���� ���� ������" + min);
	
	System.out.println("");	
	//�б޿��� 1���� �����ΰ�? �̸��� ����ض�.


	


	


	
	
	}
}
