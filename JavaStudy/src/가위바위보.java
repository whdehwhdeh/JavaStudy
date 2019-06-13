
public class 가위바위보 {
	public static void main(String[] args) {

		// 찌:0, 묵:1, 빠:2 3 4567 
		int 나 = 2; // 보
		int 상대방 = 0; // 가위
		int x = 1;

		if ((나 + x) % 8 == 상대방) {
			System.out.println("짐");

		} else {
			if (나 == 상대방) {
				System.out.println("비김");
			} else {
				System.out.println("이김");
			}

		}

	}
}