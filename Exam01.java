import java.util.Arrays;
 
public class Exam01 {

	public static void main(String[] args) {

		String str = "ZAbcdVefEg";
		reverseStr(str);
		System.out.println(reverseStr(str));

	}

	private static String reverseStr(String str) {
		
		String[] a = str.split("");
		Arrays.sort(a);
		return String.join("", a);  
	}

}
