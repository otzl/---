package ��°��;

public class Question13_�� {

	public static void main(String[] args) {

		// ���� N�� �Է¹޾� N*N �迭�� ������ ���� ���ڸ� �����ϰ� ����Ͻÿ�.

		int[][] array = new int[5][5];

		int num = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (i % 2 == 1) {
					array[i][4 - j] = num;
				} else {
					array[i][j] = num;
				}
				num++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.printf(" %2d", array[i][j]);
			}
			System.out.println(" ");
		}

	}

}
