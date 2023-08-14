import java.io.*;
import java.util.*;
class Main {
	static int N, K;
	static int[] visited;
	static List<Integer>[] graph;
	static List<Integer> result = new ArrayList<>();
	static Queue<Integer> q = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] info = br.readLine().split(" ");
		int M, X;
		N = Integer.parseInt(info[0]);
		M = Integer.parseInt(info[1]);
		K = Integer.parseInt(info[2]);
		X = Integer.parseInt(info[3]);
		
		visited = new int[N+1];
		Arrays.fill(visited, -1);
		graph = new ArrayList[N+1];
		for(int i=1; i<=N; i++) graph[i] = new ArrayList<>();
		
		for(int i=0; i<M; i++) {
			String[] roads = br.readLine().split(" ");
			graph[Integer.parseInt(roads[0])].add(Integer.parseInt(roads[1]));
		}
		bfs(X);
		if(result.size()==0) {
			System.out.print(-1);
			return;
		} else {
			Collections.sort(result);
			for(Integer i : result) sb.append(i).append("\n");
		}
		System.out.print(sb.deleteCharAt(sb.length()-1).toString());
	}
	static void bfs(int idx) {
		q.offer(idx);
		visited[idx] = 0;
		int node;
		while(!q.isEmpty()) {
			node = q.poll();
			if(visited[node]>K)return;
			if(visited[node]==K) result.add(node);
			for(Integer i : graph[node]) {
				if(visited[i]==-1) {
					q.offer(i);
					visited[i] = visited[node] +1;
				}
			}
		}
	}
}