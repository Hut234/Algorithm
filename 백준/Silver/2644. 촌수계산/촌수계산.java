import java.io.*;
import java.util.*;
class Main {
	private static int[] visited;
	private static List<Integer>[] graph;
	private static Queue<Integer> q = new LinkedList<>();
	private static int a, b;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		visited = new int[N+1];
		Arrays.fill(visited, -1);
		graph = new ArrayList[N+1];
		for(int i=1; i<=N; i++) graph[i] = new ArrayList<>();
		
		String[] ab = br.readLine().split(" ");
		a = Integer.parseInt(ab[0]);
		b = Integer.parseInt(ab[1]);
		
		int M = Integer.parseInt(br.readLine());
		int x, y;
		for(int i=0; i<M; i++) {
			String[] xy = br.readLine().split(" ");
			x = Integer.parseInt(xy[0]);
			y = Integer.parseInt(xy[1]);
			graph[x].add(y);
			graph[y].add(x);
		}
		bfs();
		System.out.println(visited[b]);
	}
	
	private static void bfs() {
		q.offer(a);
		visited[a] = 0;
		int node;
		while(!q.isEmpty()) {
			node = q.poll();
			if(node == b) return;
			for(Integer i : graph[node]) {
				if(visited[i]==-1) {
					q.offer(i);
					visited[i] = visited[node] +1;
				}
			}
		}
	}
}