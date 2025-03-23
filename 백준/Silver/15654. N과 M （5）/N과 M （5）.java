import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);

		int[] numbers = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(numbers);

		boolean[] visited = new boolean[N];
		int[] result = new int[M];
		recursion(M, 0, visited, numbers, result);
	    System.out.print(sb);
	}


	static void recursion(int depth, int current, boolean[] visited, int[] numbers, int[] result) {
		if (current == depth) {
			for (int i = 0; i < depth; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < numbers.length; i++) {
			if (visited[i]) continue;

			visited[i] = true;
			result[current] = numbers[i];
			recursion(depth, current + 1, visited, numbers, result);
			visited[i] = false;
		}
	}
}
