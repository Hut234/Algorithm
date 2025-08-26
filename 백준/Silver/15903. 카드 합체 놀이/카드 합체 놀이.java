import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);

		String[] str = br.readLine().split(" ");
		Queue<Long> pq = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			pq.offer(Long.parseLong(str[i]));
		}

		while (m-- > 0) {
			Long a = pq.poll();
			Long b = pq.poll();
			pq.offer(a + b);
			pq.offer(a + b);
		}

		long answer = 0;
		while (!pq.isEmpty()) {
			answer += pq.poll();
		}

		System.out.print(answer);
	}
}
