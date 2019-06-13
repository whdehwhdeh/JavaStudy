package ch06;

import java.util.Scanner;

public class Method1 {
	//전역변수, 멤버변수 <=클래스 영역
	static int age;
	int score;
	
	//static이 붙어있는 메소드에서는 static을 사용해야하무니다.
	
	static int input() {
		//지역변수
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num; //return이 꼭 와야함.
		
		
	}
	
	
	
	public static void main(String[] args) {
		//main과 중첩이 되지 않게 만들어야함. 변수는 이름 중요하지 x, 형식이 중요.
		System.out.println("값을 입력해주세요.");
		
		
		
		int num = input();
		
		if(num >5 ) {
			num = num -5;
			
		}
		for(int i = 0; i < 5; i++) {
		//int i <=지역변수	
		}
		
		
		System.out.println("입력된 값은?"+ num);
	}
}
