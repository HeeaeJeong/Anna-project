import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mainclass {
	
	public static void main(String[] args)throws Exception {
		
		File file = new File("c:\\myfile\\newfile.txt");
		
		//파일 읽기
		try {
		//한글자씩 읽기
			/*
			FileReader fr = new FileReader(file);
			int ch = fr.read();
			
			while(ch != -1) {
				System.out.println((char)ch);
				ch = fr.read();
			}
			fr.close();
			*/
		//문장으로 읽기	
		  BufferedReader br = new BufferedReader(new FileReader(file));	
		  
		  String str;
		  while((str = br.readLine())!=null) {
			  System.out.println(str);
		  }
		  br.close();
		  
					
		} catch(FileNotFoundException e) {  //->catch(Exception e)로 활용할 수 있음.
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
