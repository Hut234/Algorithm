import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		String word = br.readLine();
		int startIdx = 0;
		int answer = 0;
		while (true) {
			int idx = text.indexOf(word, startIdx);

			if (idx == -1) break;

			answer++;
			startIdx = idx + word.length();
		}

		System.out.print(answer);
	}
}
