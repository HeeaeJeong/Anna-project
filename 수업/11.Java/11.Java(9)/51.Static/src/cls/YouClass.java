package cls;

public class YouClass {
	
	int number;

	public void memberMethod() {
		System.out.println("YouClass memberMethod()");
	}
	
	public static void staticMethod() {
		System.out.println("YouClass staticMethod()");
				
		// ¸â¹öº¯¼ö
	//	number = 1;
	//	memberMethod();
	//	this
	//	super
		
		swap(null, 0, 0);
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

