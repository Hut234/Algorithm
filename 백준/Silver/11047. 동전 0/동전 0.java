import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		int N = Integer.parseInt(nk[0]);
		int K = Integer.parseInt(nk[1]);
		
		int[] coins = new int[N];
		for(int i=0; i<N; i++)
			coins[i] = Integer.parseInt(br.readLine());
		
		int result = 0;
		for(int i=N-1; i>-1; i--) {
			if(coins[i]<=K) {
				result += K/coins[i];
				K %= coins[i];
			}
			else continue;
			if(K==0) break;
		}
		System.out.println(result);
	}
}