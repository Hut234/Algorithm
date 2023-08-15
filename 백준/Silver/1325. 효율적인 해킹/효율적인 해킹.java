import java.io.*;
import java.util.*;
public class Main {
	static int N;
	static boolean[] visited;
	static int[] cpu;
	static List<Integer>[] al;
	static Queue<Integer> q = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		cpu = new int[N+1];
		al = new ArrayList[N+1];
		for(int i=1; i<=N; i++) al[i] = new ArrayList<>();
		int a, b;
		while(M-->0) {
			String[] rel = br.readLine().split(" ");
			al[Integer.parseInt(rel[0])].add(Integer.parseInt(rel[1]));
		}
		for(int i=1; i<=N; i++) {
			if(!al[i].isEmpty()) {
				visited = new boolean[N+1];
				bfs(i);
			}
		}
		int max = -1;
		for(int i : cpu) max = Integer.max(max, i);
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++) {
			if(cpu[i]==max) sb.append(i).append(" ");
		}
		System.out.println(sb.deleteCharAt(sb.length()-1).toString());
	}
	static void bfs(int idx) {
		q.offer(idx);
		visited[idx] = true;
		int node;
		while(!q.isEmpty()) {
			node = q.poll();
			for(Integer i : al[node]) {
				if(!visited[i]) {
					q.offer(i);
					visited[i] = true;
					cpu[i]++;
				}
			}
		}
	}
}