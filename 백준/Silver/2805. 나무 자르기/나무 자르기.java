import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] heights = new int[N];
		int max = 0;
		for (int i = 0; i < N; i++) {
			heights[i] = Integer.parseInt(st.nextToken());
			max = Integer.max(max, heights[i]);
		}

		int start = 0, end = max;
		int answer = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (isEnough(heights, mid, M)) {
				answer = mid;
				start = mid + 1;
			}
			else end = mid - 1;
		}

	    System.out.print(answer);
	}

	private static boolean isEnough(int[] heights, int cuttingHeight, int standard) {
		long sum = 0;
		for (int height : heights) {
			sum += Integer.max(height - cuttingHeight, 0);
		}

		return sum >= standard;
	}
}
