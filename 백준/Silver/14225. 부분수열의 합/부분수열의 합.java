import java.io.*;
class Main {
	static int N;
	static int[] ARR;
	static boolean[] RESULT = new boolean[20000001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		ARR = new int[N];
		String[] input = br.readLine().split(" ");
		for(int i=0; i<N; i++) ARR[i] = Integer.parseInt(input[i]);
		recur(0, 0);
		for(int i=1; i<RESULT.length; i++) {
			if(!RESULT[i]) {
				System.out.println(i);
				return;
			}
		}
	}
	private static void recur(int idx, int sum) {
		if(idx==N) {
			RESULT[sum] = true;
		 	return;
		}
		recur(idx+1, sum+ARR[idx]);
		recur(idx+1, sum);
	}
}