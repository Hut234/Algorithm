import java.io.*;
class Main {
	private static int N, M, CNT;
	private static boolean[] VISITED;
	private static boolean[][] INFO;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		VISITED = new boolean[N+1];
		INFO = new boolean[N+1][N+1];
		int s, e;
		for(int i=0; i<M; i++) {
			String[] info = br.readLine().split(" ");
			s = Integer.parseInt(info[0]);
			e = Integer.parseInt(info[1]);
			INFO[s][e] = true;
			INFO[e][s] = true;
		}
		
		for(int i=1; i<=N; i++) {
			if(!VISITED[i]) {
				CNT++;
				recur(i);
			}
		}
		System.out.print(CNT);
	}
	
	private static void recur(int idx) {
		if(VISITED[idx]) return;
		VISITED[idx] = true;
		for(int i=1; i<=N; i++) {
			if(INFO[idx][i]) recur(i);
		}
	}
}