import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int result;
	static int N;
	static boolean[] columns;
	static boolean[] left2Right;
	static boolean[] right2Left;

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		columns = new boolean[N + 1];
		left2Right = new boolean[N * 2 + 1];
		right2Left = new boolean[N * 2 + 1];

		recur(1);
		System.out.print(result);
	}

	static void recur(int row) {
		if (row == N + 1) {
			result++;
			return;
		}

		for (int column = 1; column <= N; column++) {
			if (columns[column] || left2Right[row - column + N] || right2Left[row + column]) continue;

			columns[column] = true;
			left2Right[row - column + N] = true;
			right2Left[row + column] = true;

			recur(row + 1);

			columns[column] = false;
			left2Right[row - column + N] = false;
			right2Left[row + column] = false;
		}
	}
}