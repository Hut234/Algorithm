import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] prev = new int[N+1];
		String[] input = br.readLine().split(" ");
		int tmp, max = Integer.MIN_VALUE;
		for(int i=1; i<=N; i++) {
			tmp = Integer.parseInt(input[i-1]);
			prev[i] = prev[i-1] + Integer.parseInt(input[i-1]);
			if(prev[i]<tmp) prev[i] = tmp;
			max = Integer.max(max, prev[i]);
		}
		System.out.println(max);
	}
}