import java.util.Scanner;

public class Question4_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("----���̾�Ʈ ���α׷�----");
		System.out.print("���� �����Ը� �Է��Ͻÿ� : ");
		int weight = sc.nextInt();
		System.out.print("��ǥ �����Ը� �Է��Ͻÿ� : ");
		int goal = sc.nextInt();
		int result = weight - goal;
		int sum = 0;

		while (true) {
			for (int i = 1;; i++) {
				System.out.print(i + "���� ���� ������ �Է� : ");
				int input = sc.nextInt();
				sum += input;
				if (result == sum) {
					System.out.println(i + "���� ���̾�Ʈ ���� !!!");
					break;
				}
			}
			break;
		}

	}

}
