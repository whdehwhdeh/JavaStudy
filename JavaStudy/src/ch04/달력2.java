package ch04;

import java.util.Calendar;

public class 달력2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//현재 월의 1일로 날짜 설정
		cal.set(2019, 5, 1);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 월만 +1해줘야 한다.
		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("" + year + month + day); // 문자열을 앞에 더 하면 뒤에 다 문자열로 더한다.
		System.out.println(week); //화요일 
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		
		//1일의 실제 요일 위치에 맞도록 반복문 작성 가능
		// for() {}
		
		for(int d= 1; d <= lastDay; d++) {
			System.out.print(d+ "\t");
			if(week%7==0) {
				System.out.println();
			}
			week ++; // 일자가 중가될 때 요일의 숫자도 같이 증가
		}

	}

}
