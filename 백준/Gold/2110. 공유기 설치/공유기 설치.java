import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int[] houses = new int[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			houses[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(houses);

		int start = 0, end = 1_000_000_000;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (determine(houses, mid, C)) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		System.out.print(end);
	}

	private static boolean determine(int[] houses, int distance, int routerCount) {
		int count = 1;
		int prev = houses[0];
		int len = houses.length;
		for (int i = 1; i < len; i++) {
			if (houses[i] - prev >= distance) {
				prev = houses[i];
				count++;
			}
		}

		return routerCount <= count;
	}
}