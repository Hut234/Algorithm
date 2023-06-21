import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			int N = Integer.parseInt(br.readLine());
			long[] prev = new long[N+1];
			String[] input = br.readLine().split(" ");
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			for(int i=1; i<=N; i++) {
				int val = Integer.parseInt(input[i-1]);
				prev[i] = prev[i-1] + val;
				max = Integer.max(max, val);
				min = Integer.min(min, val);
			}
			if(min==max) {
				System.out.println(0);
				continue;
			}
			long sum = prev[N];
			long tmp = 0;
			long cnt = N-1;
			for(int i=N; i>1; i--) {
				if(sum%i!=0) continue;
				if(max>sum/i) continue;
				tmp = sum/i;
				for(long j=tmp; j<=sum; j+=tmp) {
					if(Arrays.binarySearch(prev, j)<0) break;
					if(sum==j) cnt = N-i;
				}
				if(cnt!=N-1) break;
			}
			System.out.println(cnt);
		}
	}
}