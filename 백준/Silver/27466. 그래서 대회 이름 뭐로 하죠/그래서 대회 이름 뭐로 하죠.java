import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	static int N;
	static int M;
	static String S;

	public static void main(String[] args) {
		getInput();
		solve();
	}

	static void solve() {
		boolean findingLast = true;
		int countA = 0;
		for (int i = S.length() - 1; i > -1; i--) {
			if (findingLast) {
				if (S.charAt(i) == 'A' || S.charAt(i) == 'E' || S.charAt(i) == 'I' || S.charAt(i) == 'O' || S.charAt(i) == 'U') continue;
				sb.append(S.charAt(i));
				findingLast = false;
			} else {
				if (countA < 2) {
					if (S.charAt(i) == 'A') {
						countA++;
						sb.append('A');
					}
				} else {
					if (sb.length() < M) {
						sb.append(S.charAt(i));
					} else {
						break;
					}
				}
			}
		}

		if (sb.length() < M) {
			System.out.print("NO");
		} else {
			System.out.print("YES\n" + sb.reverse());
		}
	}

	static void getInput() {
		N = sc.nextInt();
		M = sc.nextInt();
		S = sc.next();
	}
}