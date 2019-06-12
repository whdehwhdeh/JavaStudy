package ch04;

public class Gugudan2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j)+ "\t");  // \t 숫자 크기에 상관없이 띄어쓰기가 된다.
			}
			
			System.out.println(); //단이 바뀌면서 줄이 바겨짐. 안쪽 for가 끝이 났을 때 사용.
		}
	}
}