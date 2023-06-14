import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]), n = N;
		int K = Integer.parseInt(input[1]);
		int[] prev = new int[N+1];
		String[] str = br.readLine().split(" ");
		for(int i=1; i<=N; i++) prev[i] = prev[i-1] + Integer.parseInt(str[i-1]);
		int[] result = new int[n-K+1];
		for(int i=0; i<result.length; i++) result[i] = prev[K++] - prev[i];
		Arrays.sort(result);
		System.out.println(result[result.length-1]);
	}
}