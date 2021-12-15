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
		// String "안녕하세요" "반갑습니다" "" 3개 저장
		// String data 3개 불러오기 -> 배열저장 -> 출력
		String name[] = { "홍길동", "성춘향", "일지매" };
		
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
			
			// 데이터의 갯수를 파악
			BufferedReader br = new BufferedReader(new FileReader(file));						
			while((str = br.readLine()) != null) {
				count++;
			}
			
		//	System.out.println(count);
			student = new String[count];
			int n = 0;
			
			br = new BufferedReader(new FileReader(file));
			// 실제의 데이터의 저장
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
		
		
		String human[] = { "홍길동", "24", "서울시" };
		
		// 파일에 저장 -> println 을 한번 사용해서 저장. 	"홍길동24서울시" 
		// 파일에서 불러오기 -> 배열 [0] -> 이름 [1] -> 나이 [2] -> 주소 
		
		File file1 = new File("c:\\myfile\\member.txt");	
		try {
			PrintWriter pw1 = new PrintWriter(new BufferedWriter(new FileWriter(file1)));
			
			String str1 = human[0] + "-" + human[1] + "-" + human[2]; // 홍길동-24-서울시
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
