package ch04;

public class Exam4_5 {
	public static void main(String[] args) {
		boolean isContinue = true;
		int count = 0;

		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);

			
			if(num1 + num2 == 10)
				isContinue = false;
			System.out.println("(" + num1 + "," + num2+")");
			count++;
		}
		System.out.println("�ֻ����� ���� Ƚ�� : " + count);
	}
}