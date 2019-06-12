package ch04;

import java.util.Calendar;

public class �޷� {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		// 1. ���� ��¥ ���� �˾Ƴ���.
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // ���� +1����� �Ѵ�.
		int day = cal.get(Calendar.DATE);

		System.out.println("" + year + month + day); // ���ڿ��� �տ� �� �ϸ� �ڿ� �� ���ڿ��� ���Ѵ�.

		// 2. ��¥ �����ϱ�
		cal.set(2012, 2, 27);

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);

		System.out.println("" + year + month + day);

		// 3. ��¥ ���ϱ�(����) D-DAY
		cal.add(Calendar.DATE, 3000);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);
		System.out.println("" + year + month + day);
		
		//4. ���� ���� ������ ��¥ ���ϱ�
		int lastDay = cal.getActualMaximum(Calendar.DATE); //�ִ� ū ���� ���ڿ��� ��� �� �� �ִ�.
		System.out.println(lastDay);
		
	}

}

