import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:\\myfile\\writeData.txt");

		try {
			
			// ����
			/*
			FileWriter fw = new FileWriter(file);
			fw.write("�ȳ��ϼ���");
			fw.write("hi hello");
			fw.close();
			*/
			
			// �߰�����
			/*
			FileWriter fw = new FileWriter(file, true);
			fw.write("�ݰ����ϴ�");
			fw.close();
			*/
			
			// ���徲��
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("�ȳ��ϼ���");
			pw.println("nice to meet you");
			pw.println("�ǰ��ϼ���");
			
			pw.close();
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
