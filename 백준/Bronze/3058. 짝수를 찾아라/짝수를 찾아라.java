import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			String[] input = br.readLine().split(" ");
			int sum = 0;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < 7; i++) {
				int x = Integer.parseInt(input[i]);
				if (x % 2 == 0) {
					sum += x;
					min = Integer.min(min, x);
				}
			}
			sb.append(sum).append(" ").append(min).append("\n");
		}
	    System.out.print(sb);
	}
}
