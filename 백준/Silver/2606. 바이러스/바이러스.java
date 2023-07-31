import java.io.*;
import java.util.*;
class Main {
	private static int v, e, result;
	private static boolean[] visited;
	private static List<Integer>[] graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		v = Integer.parseInt(br.readLine());
		e = Integer.parseInt(br.readLine());
		visited = new boolean[v+1];
		graph = new ArrayList[v+1];
		for(int i=1; i<=v; i++) graph[i] = new ArrayList<>();
		
		int pc1, pc2;
		for(int i=0; i<e; i++) {
			String[] info = br.readLine().split(" ");
			pc1 = Integer.parseInt(info[0]);
			pc2 = Integer.parseInt(info[1]);
			graph[pc1].add(pc2);
			graph[pc2].add(pc1);
			
		}
		dfs(1);
		System.out.print(result);
		
	}
	private static void dfs(int idx) {
		visited[idx] = true;
		Iterator<Integer> iter = graph[idx].iterator();
		int tmp;
		while(iter.hasNext()) {
			tmp = iter.next();
			if(!visited[tmp]) {
				result++;
				dfs(tmp);
			}
		}
	}
}

