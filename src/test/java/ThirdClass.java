import java.util.Scanner;

public class ThirdClass {

	public static void main(String[] args) {

		int rev = 0;

		int num = 12345;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		System.out.println(rev);

		String name = "durga";
		String revn;

		for (int g = name.length() - 1; g >= 0; g--) {

			System.out.println(name.charAt(g));
		}

	}

}
