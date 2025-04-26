import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);

		String[] S = new String[N];
		for (int i = 0; i < N; i++) S[i] = br.readLine();
		Arrays.sort(S);

		String[] prefix = new String[M];
		for (int i = 0; i < M; i++) prefix[i] = br.readLine();

		int result = 0;
		for (int i = 0; i < M; i++) {
			String cur = prefix[i];
			int start = 0, end = N - 1;
			while (start <= end) {
				int mid = (start + end) / 2;
				String s = S[mid];

				if (s.startsWith(cur)) {
					result++;
					break;
				}

				if (s.compareTo(cur) > 0) {
					end = mid - 1;
				} else if (s.compareTo(cur) < 0) {
					start = mid + 1;
				}
			}
		}

		System.out.print(result);
	}
}