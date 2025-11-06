import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N = new Scanner(System.in).nextInt();
		int answer = 0;
		while (N >= 0) {
			if (N % 5 == 0) {
				System.out.print(answer + (N / 5));
				return;
			}

			N -= 3;
			answer++;
		}
		System.out.print(-1);
	}
}