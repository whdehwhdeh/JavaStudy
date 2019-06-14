package ch07;

public class Exam7_3 {
	public static void main(String[] args) {

		Class7_3 c = new Class7_3();
		c.method1();

	}
}

class Class7_3 {
	int a;

	public static void method1() {
		System.out.println("method1 실행 시작");

		Class7_3 c = new Class7_3();
		for (int i = 0; i < 5; i++) {

			c.method2();

		}
		System.out.println("method1 실행 종료");
	}

	public void method2() {

		a = a + 1;

		System.out.println(a);

	}
}