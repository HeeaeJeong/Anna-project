import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		/*
		break	== 	Ż�� escape 
					loop�� �����.
					
		switch, for, while, do while
		
		switch(variable){
			case value:
				processing
				break;
		}
						
		
		for(int i = 0;i < 100; i++){	0...99
			if(����){
				break;
			}					
		}
		
		w = 0;
		while(w < 100){					
			if(����){
				break;
			}	
			w++;			
		}
*/

for(int i = 0;i < 10; i++) {
	System.out.println("for loop " + i);
	if(i == 5) {
		break;
	}
}

int array[] = { 1, 4, -7, 3, 8 };
for(int i = 0;i < array.length; i++) {
	System.out.println("array[" + i + "] = " + array[i]);
	if(array[i] < 0) {
		break;
	}
}

Scanner sc = new Scanner(System.in);		
int number;

while(true) {
	System.out.print("���ڸ� �Է�(>0) = ");
	number = sc.nextInt();
	
	if(number > 0) {
		break;
	}
	System.out.println("����� �Է��� �ֽʽÿ�");
}

// 2�� for�� Ż��
for (int i = 0; i < 10; i++) {
	System.out.println("i = " + i);
	for (int j = 0; j < 8; j++) {
		System.out.println("\tj = " + j);
		
		if(i == 5 && j == 3) {
			break;
		}
	}
}

// 1. loop���� ������ �°� break�� ����
boolean b = false;		
for (int i = 0; i < 10; i++) {
	System.out.println("i = " + i);
	for (int j = 0; j < 8; j++) {
		System.out.println("\tj = " + j);
		
		if(i == 5 && j == 3) {
			b = true;						
		}
		if(b == true) {
			break;					
		}
	}
	if(b == true) {
		break;
	}			
}

// 2. break�� ����
out:for (int i = 0; i < 10; i++) {
	System.out.println("i = " + i);
	for (int j = 0; j < 8; j++) {
		System.out.println("\tj = " + j);
		
		if(i == 4 && j == 5) {
			break out;
		}
	}
}

	}}

