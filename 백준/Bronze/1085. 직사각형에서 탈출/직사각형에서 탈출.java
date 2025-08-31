import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int minX = Integer.min(x, Math.abs(w - x));
		int minY = Integer.min(y, Math.abs(h - y));
		System.out.print(Integer.min(minX, minY));
	}
}
