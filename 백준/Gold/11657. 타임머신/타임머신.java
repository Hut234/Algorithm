import java.util.ArrayList;
import java.util.List;
class Main {
	public static void main(String[] args) throws Exception {
		int N = read();
		int M = read();
		long[] dist = new long[N+1];
		for(int i=1; i<=N; i++) dist[i] = Integer.MAX_VALUE;
		List<Edge> al = new ArrayList<>();
		for(int i=0; i<M; i++) al.add(new Edge(read(), read(), read()));
		dist[1] = 0;
		Edge cur;
		boolean cycle = false;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				cur = al.get(j);
				if(dist[cur.start]!=Integer.MAX_VALUE) {
					long tmp = dist[cur.start] + cur.weight;
					if(dist[cur.end]>tmp) {
						if(i==N-1) cycle = true;
						dist[cur.end] = tmp;
					}
				}
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
			if(c==13) System.in.read();
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