package ��°��;

public class Question10_�� {

	public static void main(String[] args) {

		// ���� N�� �Է¹޾� N*N �迭�� ������ ���� ���ڸ� �����ϰ� ����Ͻÿ�.
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		
		int num = 1;
		int[][]array = new int[5][5];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				array[i][j] = num;
				num++;
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.printf(" %2d",array[j][i]);
			}
			System.out.println(" ");
		}
		
	
	}

}
