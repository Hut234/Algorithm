import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		boolean[] unavailable = new boolean[10];
		for (int i = 0; i < M; i++) {
			unavailable[sc.nextInt()] = true;
		}

		int answer = Math.abs(N - 100);
		for (int i = 0; i < 999999; i++) {
			if (answer == 0) break;

			String currentChannel = String.valueOf(i);

			boolean possible = true;
			for (char c : currentChannel.toCharArray()) {
				if (unavailable[c - '0']) {
					possible = false;
					break;
				}
			}

			if (!possible) continue;

			int count = currentChannel.length() + Math.abs(N - i);
			answer = Math.min(answer, count);
		}

		System.out.print(answer);
	}
}
