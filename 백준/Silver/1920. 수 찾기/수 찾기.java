import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] stdStr = br.readLine().split(" ");
		int M = Integer.parseInt(br.readLine());
		String[] inputStr = br.readLine().split(" ");
		int[] std = new int[N];
		for(int i=0; i<N; i++) {
			std[i] = Integer.parseInt(stdStr[i]);
		}
		Arrays.sort(std);
		int val, start, end, mid, result;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			val = Integer.parseInt(inputStr[i]);
			start = 0;
			end = N-1;
			result = 0;
			for(;!(start>end);) {
				mid = (start+end) /2;
				if(std[mid]>val) {
					end = mid-1;
				} else if(std[mid]<val) {
					start = mid+1;
				} else {
					result = 1;
					break;
				}
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb.toString());
	}
}