import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NMT = br.readLine().split(" ");
		int N = Integer.parseInt(NMT[0]);
		int M = Integer.parseInt(NMT[1]);
		int T = Integer.parseInt(NMT[2]);

		String[] KAB = br.readLine().split(" ");
		int K = Integer.parseInt(KAB[0]);
		int A = Integer.parseInt(KAB[1]);
		int B = Integer.parseInt(KAB[2]);

		char[][] board = new char[N+1][M+1];
		for (int i = 1; i <= N; i++) {
			char[] chars = br.readLine().toCharArray();
			for (int j = 1; j <= M; j++) {
				board[i][j] = chars[j - 1];
			}
		}
		while (T-- > 0) {
			int[][] accumulate = getPrefixSum(board);
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= M; j++) {
					int minX = Integer.max(i-K, 1);
					int minY = Integer.max(j-K, 1);
					int maxX = Integer.min(i+K, N);
					int maxY = Integer.min(j+K, M);
					int count = accumulate[maxX][maxY] - accumulate[maxX][minY-1] - accumulate[minX-1][maxY] + accumulate[minX-1][minY-1];
					if (board[i][j] == '*') {
						count--;
						if (count < A || count > B) board[i][j] = '.';
					} else {
						if (count > A && count <= B) board[i][j] = '*';
					}
				}
			}
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				bw.write(board[i][j]);
			}
			bw.newLine();
		}
		bw.flush();
	}

	private static int[][] getPrefixSum(char[][] board) {
		int[][] response = new int[board.length][board[0].length];

		for (int i = 1; i < board.length; i++) {
			for (int j = 1; j < board[0].length; j++) {
				response[i][j] = response[i-1][j] + response[i][j-1] - response[i-1][j-1]
					+ ('*' == board[i][j] ? 1 : 0);
			}
		}

		return response;
	}
}
