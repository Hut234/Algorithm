import java.io.*;
import java.util.*;
class Main {
	static int N;
	static int[] SOUR, BITTER;
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		SOUR = new int[N];
		BITTER = new int[N];
		for(int i=0; i<N; i++) {
			String[] input = br.readLine().split(" ");
			SOUR[i] = Integer.parseInt(input[0]);
			BITTER[i] = Integer.parseInt(input[1]);
		}
		recur(0, 1, 0);
		Collections.sort(list);
		System.out.println(list.get(0)==1? list.get(1) : list.get(0));
	}
	private static void recur(int idx, int sour, int bitter) {
		if(idx == N) {
			list.add(Math.abs(sour-bitter));
			return;
		}
		recur(idx+1, sour*SOUR[idx], bitter+BITTER[idx]);
		recur(idx+1, sour, bitter);
	}
}