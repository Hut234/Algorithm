import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cnt = N;
		int[] weight = new int[N];
		int[] height = new int[N];
		int i=0, j=0;
		StringTokenizer st;
		while(cnt-->0) {
			st = new StringTokenizer(br.readLine());
			weight[i++] = Integer.parseInt(st.nextToken());
			height[j++] = Integer.parseInt(st.nextToken());
		}
		int[] k = new int[N];
		for(int p=0; p<N; p++) {
			for(int q=0; q<N; q++) {
				if(weight[p]<weight[q]&&height[p]<height[q]) k[p]++;
			}
		}
		int[] dup = new int[50];
		for(int p=0; p<N-1; p++) {
			for(int q=p+1; q<N; q++) {
				if(k[p]==k[q]&&dup[k[p]]==0) dup[k[p]]++;
			}
		}
		for(int p=47; p>-1; p--) {
			if(dup[p]>1) {
				for(int q=0; q<N; q++) {
					if(p+1 == k[q]) {
						k[q] += (dup[p]-1);
					}
				}
			}
		}
		for(int val : k) {
			System.out.print(val+1 + " ");
		}
		
	}
}