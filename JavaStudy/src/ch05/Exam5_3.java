package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		
		//1.�迭��� �����ֱ�
		for (int i = 0; i < nums.length; i++) {
			int a = (int) (Math.random() * nums.length);

			char tmp;

			tmp = nums[a];
			nums[a] = nums[i];
			nums[i] = tmp;

		}
		//2.�迭��� �ٸ��ָ鼭 ����ϱ�
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
	
			if((i + 1) %3 ==0) {
				System.out.println();
			}
		}
	}
}