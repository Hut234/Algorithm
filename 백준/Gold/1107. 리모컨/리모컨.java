import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int N;
	static int M;
	static int length;
	static int result = 500000;
	static List<Integer> availableButtons = new ArrayList<>();

	public static void main(String[] args) {
		getInput();
		solve();
	}

	private static void solve() {
		dfs(0, 0);
		int answer = Integer.min(Math.abs(N - 100), result);
		System.out.print(answer);
	}

	private static void dfs(int depth, int currentChannel) {
		if (depth > length + 1) return;

		if (depth != 0) {
			result = Integer.min(result, Math.abs(N - currentChannel) + depth);
		}

		int len = availableButtons.size();
		for (int i = 0; i < len; i++) {
			currentChannel = currentChannel * 10 + availableButtons.get(i);
			dfs(depth + 1, currentChannel);
			currentChannel /= 10;
		}
	}

	private static void getInput() {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		N = Integer.parseInt(n);
		length = n.length();
		M = sc.nextInt();
		int[] brokenButtons = new int[M];
		for (int i = 0; i < M; i++) {
			brokenButtons[i] = sc.nextInt();
		}
		Arrays.sort(brokenButtons);

		for (int i = 0; i <= 9; i++) {
			if (Arrays.binarySearch(brokenButtons, i) < 0) {
				availableButtons.add(i);
			}
		}
	}
}