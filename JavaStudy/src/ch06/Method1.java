package ch06;

import java.util.Scanner;

public class Method1 {
	//��������, ������� <=Ŭ���� ����
	static int age;
	int score;
	
	//static�� �پ��ִ� �޼ҵ忡���� static�� ����ؾ��Ϲ��ϴ�.
	
	static int input() {
		//��������
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num; //return�� �� �;���.
		
		
	}
	
	
	
	public static void main(String[] args) {
		//main�� ��ø�� ���� �ʰ� ��������. ������ �̸� �߿����� x, ������ �߿�.
		System.out.println("���� �Է����ּ���.");
		
		
		
		int num = input();
		
		if(num >5 ) {
			num = num -5;
			
		}
		for(int i = 0; i < 5; i++) {
		//int i <=��������	
		}
		
		
		System.out.println("�Էµ� ����?"+ num);
	}
}
