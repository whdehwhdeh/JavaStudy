package ch06;

public class Method2 {
	static boolean signUp(String id, String pw) {
		// ID 자리수 검사
		if (id.length() <= 4) {
			return false;
		}
		// pw 자리수 검사
		if (pw.length() <= 4) { // else 를 쓰지 않는 이유는 id와 pw가 연관x 따로 따로~!
			return false;

		}
		return true;
	}

	public static void main(String[] args) {
		boolean result = signUp("abcde", "12345");
		if (result) {
			System.out.println("가입성공");
		} else {
			System.out.println("가입실패");
		}
	}
}
           //뭐 땜시 가입이 안되는지 물어보기? . . . !
