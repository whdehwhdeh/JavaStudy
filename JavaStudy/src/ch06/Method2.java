package ch06;

public class Method2 {
	static boolean signUp(String id, String pw) {
		// ID �ڸ��� �˻�
		if (id.length() <= 4) {
			return false;
		}
		// pw �ڸ��� �˻�
		if (pw.length() <= 4) { // else �� ���� �ʴ� ������ id�� pw�� ����x ���� ����~!
			return false;

		}
		return true;
	}

	public static void main(String[] args) {
		boolean result = signUp("abcde", "12345");
		if (result) {
			System.out.println("���Լ���");
		} else {
			System.out.println("���Խ���");
		}
	}
}
           //�� ���� ������ �ȵǴ��� �����? . . . !
