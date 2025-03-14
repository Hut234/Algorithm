import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] solutions = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			solutions[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(solutions);

		int min = Integer.MAX_VALUE;
		int first = 0, second = 0;
		for (int i = 0; i < N - 1; i++) {
			int start = i + 1, end = N - 1;
			while (start <= end) {
				int mid = (start + end) / 2;
				int sum = solutions[i] + solutions[mid];
				if (sum > 0) end = mid - 1;
				else if (sum < 0) start = mid + 1;
				else {
					System.out.print(solutions[i] + " " + solutions[mid]);
					return;
				}

				if (Math.abs(min) > Math.abs(sum)) {
					min = sum;
					first = solutions[i];
					second = solutions[mid];
				}
			}
		}

	    System.out.print(first + " " + second);
	}
}
