package ��°��;

public class Question14_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[5][5];

		int num = 1;
		int num1 = 4;
		System.out.println("����");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = num;
				num++;
				System.out.printf(" %2d", array[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("90�� ȸ��");
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.printf(" %2d", array[j][i]);
			}
			System.out.println(" ");

			// �������� ���������� 90�� ȸ��
//	    for(int i = 0; i <= 4; i++) {
//		for(int j = 4; j >= 0; j--) {
//			System.out.printf(" %2d",array[j][i]);
//			}
//			System.out.println(" ");
//		}

		}
	}
}
