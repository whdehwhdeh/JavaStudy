package ch06;

public class MethodT4 {

	static void dilemma(boolean a, boolean b) {
		if (a == true & b == true) {
			System.out.println("A, B �Ѵ� 5�� ����");
		}
		else if(a==true & b==false) 
			System.out.println("A����, B 10�� ����");
		else if(a==false & b==true)
			System.out.println("A10�� ����, B����");
		else 
		System.out.println("A,B�Ѵ� 1�� ����");
		
	}

	public static void main(String[] args) {

		dilemma(true,true);
	}

}
