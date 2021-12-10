import java.util.Arrays;
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				/*
					function : 함수. 독립적
					method : class에 소속된 함수.
					
					형식:
											parameter, 인수, 인자
					돌아오는 값의 자료형	함수명(들어가는 값의 자료형 변수, 들어가는 값의 자료형 변수, ...){
					
						처리
						
						return 값;			
					}
					
					void -> 자료형이 없는 것
				*/		
				
				int i = functionName('A');		// 'A' == argument
				System.out.println(i);
				
				String st = "abcDEF";
				String upst = toUpperCase(st);
				System.out.println(upst);
				
				functionName1();
				
				functionName2(6.2, 0);
				
				int r = functionName3();
				
				String str = "hello";
				int len = str.length();
				
				System.out.println( len );
				
				char c = str.charAt(1);
				System.out.println( c );
				
				
				int array[] = { 11, 22, 33 };
				int arrAlias[]; // 배열 복사
				
				arrAlias = array;	// 주소 복사		
				arrAlias[1] = 27;
				
				System.out.println(arrAlias[1]);
				System.out.println(array[1]);
				
				System.out.println(arrAlias);
				System.out.println(array);
				
				int arrayNum[] = { 1, 2, 3, 4, 5 };
				functionName4(arrayNum[0], arrayNum[1], arrayNum[2], arrayNum[3], arrayNum[4]);
				System.out.println(Arrays.toString(arrayNum));
				
				functionName5(arrayNum);
				System.out.println(Arrays.toString(arrayNum));
				
				int arr[] = functionName6(arrayNum);
				System.out.println(Arrays.toString(arr));
			}
			
			static int[] functionName6(int array[]) {
				for (int i = 0; i < array.length; i++) {
					array[i] = array[i] * 2;
				}		
				return array;
			}
			
			// 주소를 할당
			static void functionName5(int array[]) {
				for (int i = 0; i < array.length; i++) {
					array[i] = array[i] * 2;
				}
			}
			
			// value 값을 할당
			static void functionName4(int a1, int a2, int a3, int a4, int a5) {
				a1 = a1 * 2;
				a2 = a2 * 2;
				a3 = a3 * 2;
				a4 = a4 * 2;
				a5 = a5 * 2;
			}
			
			
			static int functionName3() {
				System.out.println("functionName3() 호출");		
				return 3;
			}
			
			static void functionName2(double d, int n) {
				double result;
				
				System.out.println("functionName2(double d, int n) 호출");
				
				if(n == 0) {
					System.out.println("계산할 수 없습니다");
					return;
				}
				
				result = d / n;
				System.out.println("결과값:" + result);		
			}
			
			static void functionName1() {
				System.out.println("functionName1() 호출");
				
				return;
			}	
			
			static int functionName(char c) {	// parameter
				System.out.println("functionName(char c) 호출");
				
				return 1;
			}
			
			static String toUpperCase(String str) {
				String s = "";
				for(int i = 0;i < str.length();i++) {
					int n = str.charAt(i);
					if(n >= 97) {
						n = n - 32;
					}
					s = s + (char)n;
				}
				return s;
			}
			
			
			



}
