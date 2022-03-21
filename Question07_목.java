package 둘째주;

import java.util.Scanner;

public class Question07_목 {
 
	public static void main(String[] args) { 

		// 10진수 정수를 입력받아 2진수로 변환해서 출력하시오.
 
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자입력>>");
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
