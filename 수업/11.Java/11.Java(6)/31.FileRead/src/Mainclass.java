import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mainclass {
	
	public static void main(String[] args)throws Exception {
		
		File file = new File("c:\\myfile\\newfile.txt");
		
		//���� �б�
		try {
		//�ѱ��ھ� �б�
			/*
			FileReader fr = new FileReader(file);
			int ch = fr.read();
			
			while(ch != -1) {
				System.out.println((char)ch);
				ch = fr.read();
			}
			fr.close();
			*/
		//�������� �б�	
		  BufferedReader br = new BufferedReader(new FileReader(file));	
		  
		  String str;
		  while((str = br.readLine())!=null) {
			  System.out.println(str);
		  }
		  br.close();
		  
					
		} catch(FileNotFoundException e) {  //->catch(Exception e)�� Ȱ���� �� ����.
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
