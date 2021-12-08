import java.util.Scanner;

public class 별짓기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = input; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
