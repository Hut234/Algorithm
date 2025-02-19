import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] alphabets = new int[26];
		String name = br.readLine();
		for (int i = 0; i < name.length(); i++) {
			alphabets[name.charAt(i) - 'A']++;
		}

		boolean flag = true;
		StringBuilder front = new StringBuilder();
		StringBuilder mid = new StringBuilder();
		StringBuilder back = new StringBuilder();
		if (name.length() % 2 == 0) {
			for (int i = 0; i < alphabets.length; i++) {
				if (alphabets[i] %2 != 0) {
					flag = false;
					break;
				}

				String repeatedChar = Character.toString((char) (i + 'A')).repeat(alphabets[i] / 2);
				front.append(repeatedChar);
				back.append(repeatedChar);
			}
		} else {
			int oddCount = 0;
			for (int i = 0; i < alphabets.length; i++) {
				if (oddCount > 1) {
					flag = false;
					break;
				}
				if (alphabets[i] %2 != 0) {
					oddCount++;
					mid.append(Character.toString((char) (i + 'A')));
					alphabets[i]--;
				}

				String repeatedChar = Character.toString((char) (i + 'A')).repeat(alphabets[i] / 2);
				front.append(repeatedChar);
				back.append(repeatedChar);
			}

		}

		StringBuilder answer = new StringBuilder();
		if (flag) {
			answer = front.append(mid).append(back.reverse());
		} else {
			answer.append("I'm Sorry Hansoo");
		}

		System.out.print(answer);
	}
}