import java.util.PriorityQueue;
class Main {
	static PriorityQueue<Edge> q = new PriorityQueue<>();
	static int[] parent, rank;
	public static void main(String[] args) throws Exception {
		int V = read();
		int E = read();
		parent = new int[V+1];
		rank = new int[V+1];
		for(int i=1; i<=V; i++) parent[i] = i;
		int s, e, w;
		for(int i=0; i<E; i++) {
			s = read();
			e = read();
			w = read();
			q.add(new Edge(s, e, w));
		}
		int result = 0;
		Edge now;
		while(E-->0) {
			 now = q.poll();
			 int findS = find(now.s);
			 int findE = find(now.e);
			 if(findS!=findE) {
				 union(findS, findE);
				 result += now.w;
			 }
		}
		System.out.print(result);
	}
	static void union(int a, int b) {
		if(rank[a]==rank[b]) {
			parent[a] = b;
			rank[b] += 1;
		} else if(rank[a]>rank[b]) {
			parent[b] = a;
		} else {
			parent[a] = b;
		}
	}
	static int find(int i) {
		if(parent[i]!=i) return parent[i] = find(parent[i]);
		return i;
	}
	static int read() throws Exception {
		int c, n = 0;
		boolean negative = false;
		while(true) {
			c = System.in.read() -48;
			if(c==-3) {
				negative = true;
				c = System.in.read() -48;
			}
			if(c<0||c>9) return negative ? -n : n;
			n = n*10 +c;
		}
	}
}
class Edge implements Comparable<Edge> {
	int s;
	int e;
	int w;
	Edge(int s, int e, int w) {
		this.s = s;
		this.e = e;
		this.w = w;
	}
	@Override
	public int compareTo(Edge o) {
		return this.w-o.w;
	}
}