package ��°��;

public class Question11_�� {

	public static void main(String[] args) {

		int num = 1;
		int num1 = 1;
		int[][] array = new int[5][5];
		
		System.out.println("����");
		for(int i = 0; i < array.length; i++) {
			for(int j= 0; j < array[0].length; j++) {
				array[i][j] = num;
				num++;
				System.out.printf(" %2d",array[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("180�� ȸ��");
		for(int i = 4; i >= 0; i--) {
			for(int j = 4; j >= 0; j--) {
				System.out.printf(" %2d",array[i][j]);
			}
			System.out.println(" ");
		}
		
	}

}
