import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static int L;
	static int C;
	static boolean[] visited;
	static String[] alphabets;

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		String[] input = br.readLine().split(" ");
		L = Integer.parseInt(input[0]);
		C = Integer.parseInt(input[1]);
		visited = new boolean[C];
		alphabets = new String[C];


		input = br.readLine().split(" ");
		for (int i = 0; i < C; i++) {
			alphabets[i] = input[i];
		}
		Arrays.sort(alphabets);

		recur(0, 0, new String[L], 0, 0);
	    System.out.print(sb);
	}

	static void recur(int depth, int start, String[] output, int consonant, int vowel) {
		if (depth == L) {
			if (consonant >= 2 && vowel >= 1) {
				for (String alphabet : output) sb.append(alphabet);
				sb.append("\n");
			}
			return;
		}

		for (int i = start; i < C; i++) {
			if (visited[i]) continue;

			int vowelCount = 0;
			int consonantCount = 0;
			if (isVowel(alphabets[i])) vowelCount++;
			else consonantCount++;

			visited[i] = true;
			output[depth] = alphabets[i];
			recur(depth + 1, i, output, consonant + consonantCount, vowel + vowelCount);
			visited[i] = false;
		}
	}
	static boolean isVowel(String alphabet) {
		return alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u");
	}
}