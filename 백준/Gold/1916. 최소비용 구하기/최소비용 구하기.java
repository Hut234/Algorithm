import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		int N = read();
		int M = read();
		List<Edge>[] al = new ArrayList[N+1];
		int dist[] = new int[N+1];
		for(int i=1; i<=N; i++) {
			al[i] = new ArrayList<>();
			dist[i] = Integer.MAX_VALUE;
		}
		int s, e, w;
		for(int i=0; i<M; i++) {
			s = read();
			e = read();
			w = read();
			al[s].add(new Edge(e, w));
		}
		int start = read();
		int end = read();
		Queue<Edge> pq = new PriorityQueue<>();
		pq.offer(new Edge(start, 0));
		dist[start] = 0;
		boolean[] visited = new boolean[N+1];
		Edge cur;
		int tmp;
		while(!pq.isEmpty()) {
			cur = pq.poll();
			if(visited[cur.nxt]) continue;
			visited[cur.nxt] = true;
			for(Edge edge : al[cur.nxt]) {
				tmp = dist[cur.nxt] + edge.w;
				if(tmp<dist[edge.nxt]) {
					dist[edge.nxt] = tmp;
					pq.offer(new Edge(edge.nxt, tmp));
				}
			}
		}
		System.out.print(dist[end]);
	}
	static int read() throws Exception {
		int c, n = 0;
		while(true) {
			c = System.in.read() -48;
			if(c==-35) System.in.read();
			if(c<0||c>9) return n;
			n = n*10 +c;
		}
	}
}
class Edge implements Comparable<Edge> {
	int nxt;
	int w;
	public Edge(int next, int weight) {
		this.nxt = next;
		this.w = weight;
	}
	@Override
	public int compareTo(Edge o) {
		return this.w-o.w;
	}
}