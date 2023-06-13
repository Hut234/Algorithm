import java.io.*;
import java.util.*;
class Main {
	static int N, M;
	static BufferedWriter BW;
	static Stack<Integer> STACK = new Stack<>();
	public static void main(String[] args) throws IOException {
		String[] input = (new BufferedReader(new InputStreamReader(System.in))).readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		BW = new BufferedWriter(new OutputStreamWriter(System.out));
		recur(0);
	}
	private static void recur(int idx) {
		if(idx==M) {
			Iterator<Integer> iter = STACK.iterator();
			while(iter.hasNext()) {
				System.out.print(iter.next() + " ");
			}
			System.out.println();
			return;
		}
		for(int i=1; i<=N; i++) {
			if(STACK.contains(i)) continue;
			STACK.add(i);
			recur(idx+1);
			STACK.pop();
		}
	}
}