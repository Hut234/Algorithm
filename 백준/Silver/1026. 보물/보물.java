import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		int answer = 0;
		for (int i = 0, j = N - 1; i < N; i++, j--) {
			answer += a[i] * b[j];
		}

		System.out.print(answer);
	}
}