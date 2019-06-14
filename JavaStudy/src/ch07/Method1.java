package ch07;

import java.util.Calendar;
import java.util.Scanner;

public class Method1 {
	//전역변수, 멤버변수 <=클래스 영역
	static int age;
	int score;
	
      int input() {
		//지역변수
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num; 
		
		
	}
	
	
	
	public static void main(String[] args) {
//		System .out.print("1111");
//		double dd = Math.random();
//		Calendar c = Calendar.getInstance();
		
		
		
		Method1 m = new Method1 ();
		
		m.input();
		
		new Method1().input();
		
		
	
	}
}
