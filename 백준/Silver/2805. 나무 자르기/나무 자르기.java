import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		String[] info = br.readLine().split(" ");
		int[] heights = new int[N];
		int max = 0;
		for(int i=0; i<N; i++) {
			heights[i] = Integer.parseInt(info[i]);
			max = Integer.max(max, heights[i]);
		}
		long start = 1, end = max-1, mid, sum;
		while(!(start>end)) {
			sum = 0;
			mid = (start+end) /2;
			for(int i=0; i<N; i++) {
				sum += heights[i]<=mid ? 0 : heights[i]-mid;
			}
			if(sum>=M) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		System.out.println(end);
	}
}
