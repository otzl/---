import java.util.Random;

public class 로또 {

	public static void main(String[] args) {

		Random rd = new Random();
		int[] lotto = new int[6];
		
		for(int i = 0; i <= 5; i++) {
			lotto[i] = rd.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		for(int i = 0; i <= 5; i++) {
			System.out.println("행운의 숫자 : " + lotto[i]);
			
		}

	}

}
