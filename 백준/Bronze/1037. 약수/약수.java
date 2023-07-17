import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] arr = new int[N];
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(input[i]);
		Arrays.sort(arr);
		int min = arr[0], max = arr[N-1];
		System.out.print(min*max);
	}
}