import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NS = br.readLine().split(" ");
		int N = Integer.parseInt(NS[0]);
		int S = Integer.parseInt(NS[1]);


		int[] numbers = new int[N];
		long[] accumulate = new long[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
			accumulate[i + 1] = accumulate[i] + numbers[i];
		}

		int answer = Integer.MAX_VALUE;
		for (int i = 1; i <= N; i++) {
			int start = i, end = N;
			while (end <= N && start <= end) {
				int mid = (start + end) / 2;
				long sum = accumulate[mid] - accumulate[i - 1];
				if (sum >= S) {
					end = mid - 1;
					answer = Integer.min(answer, mid - i + 1);
				} else start = mid + 1;
			}
		}

		System.out.print(answer == Integer.MAX_VALUE ? 0 : answer);
	}
}
