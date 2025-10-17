import java.math.BigInteger;
import java.util.Scanner;

class Main {

	static int moveCount;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int discusCount = new Scanner(System.in).nextInt();
        
        BigInteger moveCount = BigInteger.valueOf(2).pow(discusCount).subtract(BigInteger.ONE);
        System.out.println(moveCount);

        if (discusCount <= 20) {
            move(discusCount, 1, 3);
            System.out.print(sb);
        }
	}

	private static void move(int discusCount, int start, int end) {
		if (discusCount == 0) return;

		move(discusCount - 1, start, 6 - start - end);
		sb.append(start).append(" ").append(end).append("\n"); 
		move(discusCount - 1, 6 - start - end, end);

	}
}