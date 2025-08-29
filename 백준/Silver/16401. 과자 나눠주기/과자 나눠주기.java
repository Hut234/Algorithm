import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());


		int[] snacks = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			snacks[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(snacks);

		int start = 1, end = snacks[N - 1];
		while (start <= end) {
			int mid = (start + end) / 2;
			if (determine(snacks, mid, M)) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

	    System.out.print(end);
	}

	static boolean determine(int[] snacks, int length, int needCount) {
		int count = 0;
		for (int snack : snacks) {
			count += snack / length;
		}
		return count >= needCount;
	}
}
