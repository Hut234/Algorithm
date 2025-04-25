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

		int[] sequence = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sequence[i] = Integer.parseInt(st.nextToken());
		}

		int result = 100001;
		int start = 0, end = 0, sum = sequence[start];
		while (start > -1 && end < N && start <= end) {
			if (sum >= S) {
				result = Integer.min(result, end - start + 1);
				sum -= sequence[start++];
			} else {
				end++;
				if (end == N) break;
				sum += sequence[end];
			}
		}

		System.out.print(result == 100001 ? 0 : result);
	}
}
