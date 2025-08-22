import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int count;
	static int n;
	static int k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();

		dfs(0, new ArrayList<>(), 0);
		if (count < k) System.out.print(-1);
	}

	static void dfs(int depth, List<String> output, int sum) {
		if (count == k) return;

		if (sum == n) {
			count++;
			if (count == k) {
				System.out.print(String.join("+", output));
			}
			return;
		}

		for (int i = 1; i <= 3; i++) {
			if (sum + i > n) break;
			output.add(String.valueOf(i));
			dfs(depth + 1, output, sum + i);
			output.remove(output.size() - 1);
		}
	}
}
