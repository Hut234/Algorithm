import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		int V = read();
		int E = read();
		int K = read();
		List<Edge>[] al = new ArrayList[V+1];
		int[] dist = new int[V+1];
		for(int i=1; i<=V; i++) {
			al[i] = new ArrayList<>();
			dist[i] = Integer.MAX_VALUE;
		}
		for(int i=0; i<E; i++) {
			int s = read();
			int e = read();
			int w = read();
			al[s].add(new Edge(e, w));
		}
		Queue<Edge> pq = new PriorityQueue<>();
		pq.offer(new Edge(K, 0));
		dist[K] = 0;
		Edge cur;
		int tmp;
        boolean[] visited = new boolean[V+1];
		while(!pq.isEmpty()) {
			cur = pq.poll();
			if(visited[cur.e]) continue;
			visited[cur.e] = true;
			for(Edge edge : al[cur.e]) {
				tmp = dist[cur.e] + edge.w;
				if(tmp<dist[edge.e]) {
					dist[edge.e] = tmp;
					pq.offer(new Edge(edge.e, tmp));
				}
			}
		}
		int result;
		for(int i=1; i<=V; i++) {
			result = dist[i];
			sb.append(dist[i]==Integer.MAX_VALUE ? "INF" : result).append("\n");
		}
		System.out.print(sb.deleteCharAt(sb.length()-1).toString());
	}
	static int read() throws Exception {
		int c, n = 0;
		while(true) {
			c = System.in.read() -48;
			if(c<0 || c>9) return n;
			n = n*10 +c;
		}
	}
}
class Edge implements Comparable<Edge> {
	int e;
	int w;
	
	public Edge(int e, int w) {
		this.e = e;
		this.w = w;
	}
	@Override
	public int compareTo(Edge o) {
		return this.w-o.w;
	}
}