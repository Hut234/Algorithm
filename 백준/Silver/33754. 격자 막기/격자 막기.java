import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int answer = 2;
		int N = Integer.parseInt(br.readLine());
		String[] row1 = br.readLine().split(" ");
		String[] row2 = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			if (row1[i].equals("0")) {
				answer = 1;
				if (i > 0 && row2[i - 1].equals("0")) {
					answer = 0;
					break;
				}
				if (row2[i].equals("0")) {
					answer = 0;
					break;
				}
				if (i < N - 1 && row2[i + 1].equals("0")) {
					answer = 0;
					break;
				}
			}
			if (row2[i].equals("0"))
				answer = 1;
		}
		System.out.print(answer);
	}
}