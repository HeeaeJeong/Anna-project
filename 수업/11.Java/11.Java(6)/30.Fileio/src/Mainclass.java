import java.io.File;
import java.io.IOException;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * file - ���� ��ü
		 * 		  Database(file)
		 * 
		 */
		
		File file = new File("c:\\");
		//���� ����
		/*
		String filelist[] = file.list();
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}
		*/
		
		//����? ����? ����
		/*
		File filelist[] = file.listFiles();
		for( int i = 0; i < filelist.length; i++) {
			if(filelist[i].isFile()) {
				System.out.println("[����]" + filelist[i].getName());
			}
			else if(filelist[i].isDirectory()) {
				System.out.println("[����]" + filelist[i].getName());				
			}
		}
		*/
		
		//���� ����
		File newFile = new File("c:\\myfile\\newfile.txt");
		try {
		if(newFile.createNewFile()) {
			System.out.println("���� ���� ����!");
		}else {
			System.out.println("���� ���� ����!");
		}
		}catch (IOException e) {
			System.out.println("���� �������� ���߽��ϴ�.");
		}
		
		//���� ����
		File newDir = new File("c:\\myfile\\myimage");
		if(newDir.mkdir()) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println("���� ���� ����");
		}
		
		//���� ���� ����
		if(newFile.exists()) {
			System.out.println("newfile.txt�� �����մϴ�");
		}else {
			System.out.println("newfile.txt�� �������� �ʽ��ϴ�");
		}
		
		//�б�����
		//newFile.setReadOnly();
		
		//���� ���� ����
		if(newFile.canWrite()) {
			System.out.println("���� �����մϴ�");
		}else {
			System.out.println("���� �Ұ����մϴ�");
		}
		
		//���� ����
		//newFile.delete();
		
	}

}
