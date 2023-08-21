import java.util.ArrayList;
import java.util.List;
class Main {
	static long[] dist;
    static List<Edge> al = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		int N = read();
		int M = read();
		dist = new long[N+1];
		for(int i=1; i<=N; i++) dist[i] = Integer.MAX_VALUE;
		for(int i=0; i<M; i++) al.add(new Edge(read(), read(), read()));
		dist[1] = 0;
		Edge cur;
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<M; j++) {
				cur = al.get(j);
				if(dist[cur.start]!=Integer.MAX_VALUE) {
					long tmp = dist[cur.start] + cur.weight;
					if(dist[cur.end]>tmp) dist[cur.end] = tmp;
				}
			}
		}
		boolean cycle = false;
		for(int j=0; j<M; j++) {
			cur = al.get(j);
			if(dist[cur.start]!=Integer.MAX_VALUE) {
				long tmp = dist[cur.start] + cur.weight;
				if(dist[cur.end]>tmp) cycle = true;
			}
		}
		if(cycle) {
			System.out.print(-1);
			return;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=2; i<=N; i++) {
			if(dist[i]==Integer.MAX_VALUE) sb.append(-1);
			else sb.append(dist[i]);
			sb.append("\n");
		}
		System.out.print(sb.deleteCharAt(sb.length()-1).toString());
	}
	static int read() throws Exception {
		int c, n = 0;
		boolean negative = false;
		while(true) {
			c = System.in.read();
			if(c=='-') {
				negative = true;
				c = System.in.read();
			}
			if(c<'0'||c>'9') return negative ? -n : n;
			n = n*10 +(c-'0');
		}
	}
}
class Edge implements Comparable<Edge> {
	int start;
	int end;
	int weight;
	public Edge(int s, int e, int w) {
		this.start = s;
		this.end = e;
		this.weight = w;
	}
	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}
}