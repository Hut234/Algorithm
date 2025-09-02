import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int N;
	static int M;
	static int answer = -1;
	static char[][] values;

	public static void main(String[] args) throws IOException {
		getInput();
		solve();
	}

	static void dfs(int row, int column, int dr, int dc, int value) {
		if (row < 0 || row >= N || column < 0 || column >= M) return;

		value = value * 10 + values[row][column] - '0';

		if (isPSNumber(value)) {
			answer = Integer.max(answer, value);
		}


		dfs(row + dr, column + dc, dr, dc, value);
	}

	static boolean isPSNumber(int value) {
		int sRoot = (int) Math.sqrt(value);
		return sRoot * sRoot == value;
	}

	static void solve() {
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				for (int dr = -N; dr < N; dr++) {
					for (int dc = -M; dc < M; dc++) {
						if (dr == 0 && dc == 0) continue;
						dfs(r, c, dr, dc, 0);
					}
				}
			}
		}
		System.out.print(answer);
	}

	static void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);

		values = new char[N][M];
		for (int i = 0; i < N; i++) {
			values[i] = br.readLine().toCharArray();
		}
	}
}