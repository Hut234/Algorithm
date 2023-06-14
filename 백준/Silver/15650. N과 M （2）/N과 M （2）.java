import java.io.*;
import java.util.*;
class Main {
	static int N, M;
	static Stack<Integer> STACK = new Stack<>();
	static StringBuilder SB = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		recur(0);
	}
	private static void recur(int idx) {
		if(idx==M) {
			Iterator<Integer> iter = STACK.iterator();
			while(iter.hasNext()) SB.append(iter.next()).append(" ");
			System.out.println(SB.toString());
			SB.setLength(0);
			return;
		}
		for(int i=1; i<=N; i++) {
			if(STACK.size()!=0&&STACK.peek()>=i) continue;
			STACK.push(i);
			recur(idx+1);
			STACK.pop();
		}
	}
}