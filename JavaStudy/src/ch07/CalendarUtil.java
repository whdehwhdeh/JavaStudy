package ch07;

import java.util.Calendar;

public class CalendarUtil {
	public static String getDate() {
		//���� ��¥�� ���� ����
		Calendar c = Calendar.getInstance();
		
		String date = ""; //���� ���� ���� ���� YYYY-MM-DD 2019-06-13
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		
		date = year + "-" +
		(month < 10 ? "0" + month : month) +
		(day < 10 ? "0" + day :day);
		return date;
		
	}
}
