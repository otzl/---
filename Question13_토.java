package 둘째주;

public class Question13_토 {

	public static void main(String[] args) {

		// 정수 N을 입력받아 N*N 배열에 다음과 같이 숫자를 저장하고 출력하시오.

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
