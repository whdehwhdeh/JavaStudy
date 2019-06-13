package ch06;

public class MethodT4 {

	static void dilemma(boolean a, boolean b) {
		if (a == true & b == true) {
			System.out.println("A, B 둘다 5년 복역");
		}
		else if(a==true & b==false) 
			System.out.println("A석방, B 10년 복역");
		else if(a==false & b==true)
			System.out.println("A10년 복역, B석방");
		else 
		System.out.println("A,B둘다 1년 복역");
		
	}

	public static void main(String[] args) {

		dilemma(true,true);
	}

}
