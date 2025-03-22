import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static int[] FIBONACCI = new int[46];

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());


		FIBONACCI[1] = 1;
		FIBONACCI[2] = 1;

		recursion(N);
	    System.out.print(FIBONACCI[N]);
	}

	static int recursion(int n) {
		if (n <= 2) return FIBONACCI[n];
		if (FIBONACCI[n] != 0) return FIBONACCI[n];
		FIBONACCI[n] = recursion(n - 1) + recursion(n - 2);
		return FIBONACCI[n];
	}
}
