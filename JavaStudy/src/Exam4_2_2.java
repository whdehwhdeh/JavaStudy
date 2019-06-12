public class Exam4_2_2 {
	public static void main(String[] args) {
		int year = 2019; // ¿¬µµ
		if (year % 100 == 0) {
			System.out.println("Æò³â");
		} else if (year % 4 == 0) {
			System.out.println("À±³â");

		} else if (year % 400 == 0) {
			System.out.println("À±³â");
		} else {
			System.out.println("Æò³â");
		}

	}
}