package ch06;

public class Method3 {
	static void third() {
		System.out.println("third ȣ��");
		System.out.println(4/2);
		int[] arr = new int[5];
		System.out.println(arr[1]);
	
	//void ������ return�ڿ� ���� ������ �ȵǹ��ϴ�. 
		
		
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
