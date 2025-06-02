import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int N;
	static int M;
	static String S;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		getInput();
		solve();
	}

	static void solve() {
		if (S.contains("A")) {
			dfs(0, 0, new char[M]);
		}
		System.out.print(sb.length() == 0 ? "NO" : "YES\n" + sb);
	}

	static void dfs(int depth, int start, char[] output) {
		if (sb.length() == 0)  {
			if (depth == M) {
				if (output[M - 1] == 'A' || output[M - 1] == 'E' || output[M - 1] == 'I' || output[M - 1] == 'O'
					|| output[M - 1] == 'U' || output[M - 2] != 'A' || output[M - 3] != 'A')
					return;

				for (char o : output) {
					sb.append(o);
				}
			}

			for (int i = start; i < N; i++) {
				output[depth] = S.charAt(i);
				dfs(depth + 1, i + 1, output);
			}
		}
	}

	static void getInput() throws IOException {
		String[] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		S = br.readLine();
	}
}