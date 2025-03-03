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
			int H = Integer.parseInt(input[0]);
			int N = Integer.parseInt(input[2]);

			boolean flag = N % H == 0;
			int Y = flag ? H : N % H;
			int X = flag ? N / H : N / H + 1;
			sb.append(Y).append(X < 10 ? "0" + X : X).append("\n");
		}

	    System.out.print(sb);
	}
}
