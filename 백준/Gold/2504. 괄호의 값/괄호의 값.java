import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] inputs = new Scanner(System.in).next().split("");

		int len = inputs.length;
		Deque<String> stack = new ArrayDeque<>();
		for (int i = 0; i < len; i++) {
			if (isOpen(inputs[i])) {
				stack.push(inputs[i]);
			} else {
				if (stack.isEmpty()) {
					System.out.print(0);
					return;
				} else {
					int sum = 0;
					String opposite = stack.pop();

					while (isNumber(opposite)) {
						sum += Integer.parseInt(opposite);

						if (stack.isEmpty()) {
							System.out.print(0);
							return;
						}

						String output = stack.pop();
						if (isClosed(output)) {
							System.out.print(0);
							return;
						}
						opposite = output;
					}

					if (isNotPair(opposite, inputs[i])) {
						System.out.println(0);
						return;
					}

					int value = 0;
					if ("(".equals(opposite))
						value = 2;
					else
						value = 3;
					if (sum != 0)
						stack.push(sum * value + "");
					else
						stack.push(value + "");
				}
			}
		}
		int answer = 0;
		while (!stack.isEmpty()) {
			if (isNumber(stack.peek())) {
				answer += Integer.parseInt(stack.pop());
			} else {
				System.out.print(0);
				return;
			}
		}
		System.out.print(answer);
	}

	static boolean isNotPair(String open, String close) {
		return !("(".equals(open) && ")".equals(close) || "[".equals(open) && "]".equals(close));
	}

	static boolean isOpen(String str) {
		return "(".equals(str) || "[".equals(str);
	}

	static boolean isClosed(String str) {
		return ")".equals(str) || "]".equals(str);
	}

	static boolean isNumber(String str) {
		return !(isOpen(str) || isClosed(str));
	}
}
