package ch04;

public class Gugudan2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j)+ "\t");  // \t ���� ũ�⿡ ������� ���Ⱑ �ȴ�.
			}
			
			System.out.println(); //���� �ٲ�鼭 ���� �ٰ���. ���� for�� ���� ���� �� ���.
		}
	}
}