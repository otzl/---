import java.util.Scanner;

public class Question3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1.����Ʈ���� ���� >> ");
		int sw = sc.nextInt();
		System.out.print("2.����Ʈ���� ���� >> ");
		int swd = sc.nextInt();
		System.out.print("3.�����ͺ��̽� ���� >> ");
		int db = sc.nextInt();
		System.out.print("4.���α׷��� ���Ȱ�� >> ");
		int pg = sc.nextInt();
		System.out.print("5.�����ý��� ������� >> ");
		int sy = sc.nextInt();

		int total = sw + swd + db + pg + sy;
		
		if(total >= 60 && sw >7 && swd >7 && db >7 && pg >7 && sy >7) {
			System.out.println("�հ��Դϴ�!");
		}else {
			System.out.println("Ż���Դϴ�...");
		}

		sc.close();
	}

}
