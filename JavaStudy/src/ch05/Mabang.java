package ch05;

public class Mabang {
	public static void main(String[] args) {
		// ������ ���ڸ� ������ 2���� �迭 5 x 5
		int[][] mabang = new int[7][7];

		// ��Ģ1
		int row = 0;
		int col = 3;
		mabang[row][col] = 1;

		// 2~25 ���� �ݺ�
		for (int i = 2; i <= 7*7 ; i++) {
			row = row - 1; // 1�� ����
			col = col - 1; // 1�� ����

			// ���� ������ �Ǿ��� ��
			if (row < 0) {
				// ���� ������ �Ǿ��� �� 15�� �밢�� �� ���
				if (col < 0) {
					row = row + 2;
					col = col + 1;

					// ���� ������ ��
				} else {
					row = 6; // row = 5 + row
				}
				// ���� ������ ��
			} else {
				// ���� ������ �Ǿ��� ��
				if (col < 0) {
					col = 6;
				} else {
					if (mabang[row][col] > 0) {
						row = row +2 ;
						col = col +1 ;

					}
				}

				// ���� ������ ��
			}

			mabang[row][col] = i;

		} // end for
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();

		}
	}

}
