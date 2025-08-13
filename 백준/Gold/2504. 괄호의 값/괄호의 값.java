import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] inputs = sc.nextLine().split("");

		ArrayDeque<String> stack = new ArrayDeque<>();
		int len = inputs.length;

		if (len % 2 != 0) {
			System.out.println(0);
			return;
		}

		for (int i = 0; i < len; i++) {
			String input = inputs[i];
			if (isOpen(input)) {
				stack.push(input);
			} else {
				int sum = 0;

				if (stack.isEmpty()) {
					System.out.println(0);
					return;
				}

				String output = stack.pop();
				while (isNumber(output)) {
					sum += Integer.parseInt(output);
					if (stack.isEmpty()) {
						System.out.println(0);
						return;
					}
					output = stack.pop();
				}

				if (isNotPair(output, input)) {
					System.out.println(0);
					return;
				}

				if (sum == 0) {
					if ("(".equals(output))
						stack.push("2");
					else
						stack.push("3");
				} else {
					if ("(".equals(output))
						stack.push(sum * 2 + "");
					else
						stack.push(sum * 3 + "");
				}
			}
		}

		int answer = 0;
		while (!stack.isEmpty()) {

			String cur = stack.pop();
			if (isNumber(cur))
				answer += Integer.parseInt(cur);
			else {
				System.out.println(0);
				return;
			}
		}
		System.out.println(answer);
	}

	public static boolean isOpen(String str) {
		return "(".equals(str) || "[".equals(str);
	}

	public static boolean isClosed(String str) {
		return ")".equals(str) || "]".equals(str);
	}

	public static boolean isNumber(String str) {
		return !isOpen(str) && !isClosed(str);
	}

	public static boolean isNotPair(String open, String close) {
		return !("(".equals(open) && ")".equals(close) || "[".equals(open) && "]".equals(close));
	}
}
