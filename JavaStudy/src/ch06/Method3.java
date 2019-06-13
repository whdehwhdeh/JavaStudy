package ch06;

public class Method3 {
	static void third() {
		System.out.println("third 호출");
		System.out.println(4/2);
		int[] arr = new int[5];
		System.out.println(arr[1]);
	
	//void 다음에 return뒤에 값을 적으면 안되무니다. 
		
		
	}
	
	
	
	static void second() {
		third();
	}
	
	
	static void first() {
		second();
	}
	
	public static void main(String[] args) {
		first();
		
		//Stack, Queue
		
	}
}
