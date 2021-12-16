import java.util.Scanner;

public class Question3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1.소프트웨어 설계 >> ");
		int sw = sc.nextInt();
		System.out.print("2.소프트웨어 개발 >> ");
		int swd = sc.nextInt();
		System.out.print("3.데이터베이스 구축 >> ");
		int db = sc.nextInt();
		System.out.print("4.프로그래밍 언어활용 >> ");
		int pg = sc.nextInt();
		System.out.print("5.정보시스템 구축관리 >> ");
		int sy = sc.nextInt();

		int total = sw + swd + db + pg + sy;
		
		if(total >= 60 && sw >7 && swd >7 && db >7 && pg >7 && sy >7) {
			System.out.println("합격입니다!");
		}else {
			System.out.println("탈락입니다...");
		}

		sc.close();
	}

}
