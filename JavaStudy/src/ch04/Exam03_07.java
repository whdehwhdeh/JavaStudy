package ch04;

// 소스코드 정렬 : Shift + Ctrl + F
public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345789;
		
		int total = 0;
		
		for( ;num >0 ;num = num/ 10 ) {
			int n = num % 10;
			System.out.println(n);
			total +=n; 
		}

		System.out.println(total);
		
	}
}
