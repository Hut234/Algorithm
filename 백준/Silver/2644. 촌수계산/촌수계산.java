import java.io.*;
import java.util.*;
class Main {
	private static int[] visited;
	private static List<Integer>[] graph;
	private static int a, b, result;
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
		
		visited[a] = 0;
		dfs(a);
		System.out.println(visited[b]);
	}
	
	private static void dfs(int idx) {
		for(Integer i : graph[idx]) {
			if(visited[i] == -1) {
				visited[i] = visited[idx] +1;
				dfs(i);
			}
		}
	}
}