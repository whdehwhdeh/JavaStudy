package ch06;

public class MethodT2 {
	static int getBetweenSum(int a, int b) {
		
//		a=(a > b) ? a:b;
//		if(a>b) {
//			int temp = a ;
//		      	a = b ;
//		      	b = temp ;
		
		
		int sum = 0 ;
		for(int i = a; i <=b ; i++) {
			sum += i ;
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		System.out.println(getBetweenSum(3,5));
	}
}
