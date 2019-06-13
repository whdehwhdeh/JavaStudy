package ch06;

import java.util.Calendar;

public class MethodT3 {
	static int getLastYear(int n) {
		Calendar c = Calendar.getInstance();
		c.set(2019,n-1,1);
		return c.getActualMaximum(Calendar.DATE);
		
	}
	
	public static void main(String[] args) {
		System.out.println(getLastYear(7));
	}
}
