package ch06;

public class Method_T {
	static int checkGrade(int n) {
		if(n >10 ) return 1;
		else if(n >7) return 2;
		else if(n >4) return 3;
		else return 4;
		
	}
	
	public static void main(String[] args) {
		System.out.println(checkGrade(5));
	}
}
