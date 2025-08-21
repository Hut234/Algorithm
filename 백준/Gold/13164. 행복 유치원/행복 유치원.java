import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NK = br.readLine().split(" ");
		int N = Integer.parseInt(NK[0]);
		int K = Integer.parseInt(NK[1]);

		int[] heights = new int[N];
		String[] values = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			heights[i] = Integer.parseInt(values[i]);
		}

		int[] diffs = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			diffs[i] = heights[i + 1] - heights[i];
		}

		Arrays.sort(diffs);

		// K - 1이 아닌 N - K로 하는 이유
		// K가 1일 때 0이 되므로 정상 동작하지 않음 => 이때는 N - 1 - 0을 해야함.
		// K가 N개 일 때, 0이 나와야 함.
		int answer = 0;
		for (int i = 0; i < N - K; i++) {
			answer += diffs[i];
		}

		System.out.print(answer);
	}
}