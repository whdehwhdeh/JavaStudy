public class Exam4_2_2 {
	public static void main(String[] args) {
		int year = 2019; // ����
		if (year % 100 == 0) {
			System.out.println("���");
		} else if (year % 4 == 0) {
			System.out.println("����");

		} else if (year % 400 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}

	}
}