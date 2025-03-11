import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		Set<Integer> sums = new HashSet<>();
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				int sum = numbers[i] + numbers[j];
				if (sum < 200000001) sums.add(sum);
			}
		}

		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int minus = numbers[i] - numbers[j];
				if (sums.contains(minus)) max = Integer.max(max, numbers[i]);
			}
		}

		System.out.println(max);
	}
}

