import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] values = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			values[i] = sc.nextInt();
			sum += values[i];
		}

		Arrays.sort(values);

		System.out.println(sum / 5);
		System.out.print(values[2]);
	}
}
