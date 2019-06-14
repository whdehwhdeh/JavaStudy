package ch11;



public class Main {
	public static void main(String[] args) {
		NetworkUtil nu = new NetworkUtil();
		String result =
				nu.get("https://dhlottery.co.kr/gameResult.do?method=byWin&wiselog=H_C_1_1");
		System.out.println(result);
	}

}
