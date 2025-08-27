import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int len = Integer.parseInt(br.readLine());
		int[] numbers = new int[len];
		String[] values = br.readLine().split(" ");
		for (int i = 0; i < len; i++) {
			numbers[i] = Integer.parseInt(values[i]);
		}

		int answer = 1;
		int[] dp = new int[len + 1];
		Arrays.fill(dp, 1);
		for (int i = 1; i < len; i++) {
			int cur = numbers[i];
			for (int j = 0; j < i; j++) {
				if (numbers[j] < cur) {
					dp[i] = Integer.max(dp[j] + 1, dp[i]);
					answer = Integer.max(answer, dp[i]);
				}
			}
		}

		System.out.print(answer);
	}
}