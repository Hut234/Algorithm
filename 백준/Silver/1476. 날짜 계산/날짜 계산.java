import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();

		int answer = 0;
		int e = 1, s = 1, m = 1;
		while (true) {
			answer++;
			if (e == E && s == S && m == M) {
				System.out.print(answer);
				return;
			}

			e = (++e - 1) % 15 + 1;
			s = (++s - 1) % 28 + 1;
			m = (++m - 1) % 19 + 1;
		}
	}
}