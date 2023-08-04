import java.io.*;
import java.util.*;
class Main {
	private static boolean[] visited;
	private static List<Integer>[] graph;
	private static Queue<Integer> q = new LinkedList<>();
	private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NMV = br.readLine().split(" ");
		int N = Integer.parseInt(NMV[0]);
		int M = Integer.parseInt(NMV[1]);
		int V = Integer.parseInt(NMV[2]);
		graph = new List[N+1];
		for(int i=1; i<=N; i++) graph[i] = new ArrayList<>();
		for(int i=0; i<M; i++) {
			String[] info = br.readLine().split(" ");
			int v1 = Integer.parseInt(info[0]);
			int v2 = Integer.parseInt(info[1]);
			graph[v1].add(v2);
			graph[v2].add(v1);
		}
        
        for(int i=1; i<=N; i++) Collections.sort(graph[i]);
        
		visited = new boolean[N+1];
		dfs(V);
		sb.append("\n");
		visited = new boolean[N+1];
		bfs(V);
		System.out.println(sb.toString());
	}
	
	static void dfs(int idx) {
		sb.append(idx);
		visited[idx] = true;
		for(Integer i : graph[idx]) {
			if(!visited[i]) {
				sb.append(" ");
				dfs(i);
			}
		}
	}
	static void bfs(int idx) {
		q.offer(idx);
		sb.append(idx);
		visited[idx] = true;
		int node;
		while(!q.isEmpty()) {
			node = q.poll();
			for(Integer i : graph[node]) {
				if(!visited[i]) {
					sb.append(" ").append(i);
					q.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}