import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] factorial = new long[N + 1];
		factorial[0] = 1;
		for (int i = 1; i <= N; i++) {
			factorial[i] = factorial[i - 1] * i;
		}

		System.out.print(factorial[N]);
	}

}
