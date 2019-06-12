package ch04;

import java.util.Calendar;

public class 달력 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		// 1. 현재 날짜 정보 알아내기.
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 월만 +1해줘야 한다.
		int day = cal.get(Calendar.DATE);

		System.out.println("" + year + month + day); // 문자열을 앞에 더 하면 뒤에 다 문자열로 더한다.

		// 2. 날짜 지정하기
		cal.set(2012, 2, 27);

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);

		System.out.println("" + year + month + day);

		// 3. 날짜 더하기(빼기) D-DAY
		cal.add(Calendar.DATE, 3000);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);
		System.out.println("" + year + month + day);
		
		//4. 현재 월의 마지막 날짜 구하기
		int lastDay = cal.getActualMaximum(Calendar.DATE); //최대 큰 수는 일자에만 사용 할 수 있다.
		System.out.println(lastDay);
		
	}

}

