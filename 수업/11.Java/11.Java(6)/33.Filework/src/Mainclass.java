import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String "�ȳ��ϼ���" "�ݰ����ϴ�" "" 3�� ����
		// String data 3�� �ҷ����� -> �迭���� -> ���
		String name[] = { "ȫ�浿", "������", "������" };
		
		File file = new File("c:\\myfile\\names.txt");		
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i = 0; i < name.length; i++) {
				pw.println(name[i]);
			}
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String student[] = null;
		int count = 0;
		String str;
		try {
			
			// �������� ������ �ľ�
			BufferedReader br = new BufferedReader(new FileReader(file));						
			while((str = br.readLine()) != null) {
				count++;
			}
			
		//	System.out.println(count);
			student = new String[count];
			int n = 0;
			
			br = new BufferedReader(new FileReader(file));
			// ������ �������� ����
			while((str = br.readLine()) != null) {
				student[n] = str;
				n++;
			}			
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
		
		// -----------------------------------------------------------------------
		
		
		String human[] = { "ȫ�浿", "24", "�����" };
		
		// ���Ͽ� ���� -> println �� �ѹ� ����ؼ� ����. 	"ȫ�浿24�����" 
		// ���Ͽ��� �ҷ����� -> �迭 [0] -> �̸� [1] -> ���� [2] -> �ּ� 
		
		File file1 = new File("c:\\myfile\\member.txt");	
		try {
			PrintWriter pw1 = new PrintWriter(new BufferedWriter(new FileWriter(file1)));
			
			String str1 = human[0] + "-" + human[1] + "-" + human[2]; // ȫ�浿-24-�����
			pw1.println(str1);
			
			pw1.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String mem = "";
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(file1));
			
			String str2;			
			while((str2 = br1.readLine()) != null) {
				mem = str2;
			}			
			br1.close();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}	 
		
		System.out.println(mem);		
		String split[] = mem.split("-");		
		System.out.println(Arrays.toString(split));
		
		
		// --------------------------
		
		

	}

}
