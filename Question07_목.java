package ��°��;

import java.util.Scanner;

public class Question07_�� {

	public static void main(String[] args) {

		// 10���� ������ �Է¹޾� 2������ ��ȯ�ؼ� ����Ͻÿ�.

		Scanner sc = new Scanner(System.in);

		System.out.println("�����Է�>>");
		int input = sc.nextInt();

		int[] array = { 0, 1 };

		int num = input;
		
		String a = "";
	
		
		while (true) {
			if (num % 2 == 0) {
				a = array[0]+a;
			} else {
				a = array[1]+a;
			}
			num /= 2;
			if(num == 0)
				break;
		}
		System.out.println(a);
	}
}
