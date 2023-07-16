import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] standard = br.readLine().split(" ");
		int[] std = new int[N];
		int M = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		for(int i=0; i<N; i++) std[i] = Integer.parseInt(standard[i]);
		Arrays.sort(std);
		int[] result = new int[M];
		int tmp;
		for(int i=0; i<M; i++) {
			tmp = Arrays.binarySearch(std, Integer.parseInt(input[i]));
			result[i] = tmp < 0 ? 0 : 1; 
		}
		for(int val : result) System.out.print(val + " ");
	}
}