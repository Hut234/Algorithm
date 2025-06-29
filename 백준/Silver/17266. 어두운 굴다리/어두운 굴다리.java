import java.util.Scanner;

class Main {

	static int N;
	static int M;
	static int[] lamps;

	public static void main(String[] args) {
		getInput();
		solve();
	}

	public static void getInput() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		lamps = new int[M];
		for (int i = 0; i < M; i++) lamps[i] = sc.nextInt();
	}

	public static void solve() {
		int start = 0, end = 100000;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (determination(mid)) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.print(start);
	}

	public static boolean determination(int target) {
		int count = 0;
		int prev = 0;
		for (int lamp : lamps) {
			int start = Integer.max(prev, lamp - target);
			int end = Integer.min(lamp + target, N);
			count += end - start;
			prev = end;
		}
		return count >= N;
	}
}