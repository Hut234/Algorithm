import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;
		Deque<Integer> stack = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if ("push".equals(command)) {
				stack.push(Integer.parseInt(st.nextToken()));
			} else if ("pop".equals(command)) {
				sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
			} else if ("size".equals(command)) {
				sb.append(stack.size()).append("\n");
			} else if ("empty".equals(command)) {
				sb.append(stack.isEmpty() ? 1 : 0).append("\n");
			} else {
				sb.append(stack.peek() == null ? -1  : stack.peek()).append("\n");
			}
		}

		System.out.print(sb);
	}
}