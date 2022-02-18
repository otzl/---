package 둘째주;

public class Question10_금 {
 
	public static void main(String[] args) {

		// 정수 N을 입력받아 N*N 배열에 다음과 같이 숫자를 저장하고 출력하시오.
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
