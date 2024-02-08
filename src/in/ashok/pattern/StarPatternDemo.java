package in.ashok.pattern;

public class StarPatternDemo {

	public static void main(String[] args) {
		int n = 4; // You can change the value of 'n' to control the size of the pattern

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
