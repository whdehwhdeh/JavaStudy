public class Exam4_2_1 {
	public static void main(String[] args) {
		int score = 6;

		if (score % 2 == 0 & score % 3 == 0) {
			System.out.println("쿵짝"); //큰 것이 위에 와야한다.
		} else if (score % 2 == 0) {
			System.out.println("짝");// 2의 배수인 경우
		} else if (score % 3 == 0) {// 3의 배수인 경우
			System.out.println("쿵");
		} 

	}
}
