import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static int[] counts;
	static int N;
	static int K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NK = br.readLine().split(" ");
		N = Integer.parseInt(NK[0]);
		K = Integer.parseInt(NK[1]);

		counts = new int[100001];

		if (N == K) System.out.print(0);
		else {
			bfs(N);
			System.out.print(counts[K]);
		}
	}

	static int[] direction = {1, -1, 2};

	static void bfs(int depart) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(depart);

		while (!queue.isEmpty()) {
			int cur = queue.poll();

			for (int i = 0; i < 3; i++) {
				int next = i != 2 ? cur + direction[i] : cur * direction[i];

				if (next < 0 || next > 100000) continue;
				if (counts[next] != 0 && counts[next] < counts[cur] + 1) continue;
				queue.offer(next);
				counts[next] = counts[cur] + 1;
			}
		}
	}
}
