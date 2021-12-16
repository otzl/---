import java.util.Scanner;

public class Question4_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("----다이어트 프로그램----");
		System.out.print("현재 몸무게를 입력하시오 : ");
		int weight = sc.nextInt();
		System.out.print("목표 몸무게를 입력하시오 : ");
		int goal = sc.nextInt();
		int result = weight - goal;
		int sum = 0;

		while (true) {
			for (int i = 1;; i++) {
				System.out.print(i + "주차 감량 몸무게 입력 : ");
				int input = sc.nextInt();
				sum += input;
				if (result == sum) {
					System.out.println(i + "주차 다이어트 성공 !!!");
					break;
				}
			}
			break;
		}

	}

}
