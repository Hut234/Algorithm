import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		int[] prev = new int[N+1];
		String[] str = br.readLine().split(" ");
		for(int i=1; i<=N; i++) {
			prev[i] = prev[i-1] + Integer.parseInt(str[i-1]);
		}
		int max = Integer.MIN_VALUE;
		for(int i=0, j=K; j!=N+1; i++,j++) max = Integer.max(max, prev[j]-prev[i]);
		System.out.println(max);
	}
}