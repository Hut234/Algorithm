import java.io.*;
import java.util.PriorityQueue;
class Main {
	static PriorityQueue<Edge2> q;
	static int[] parent, rank;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] VE = br.readLine().split(" ");
		int V = Integer.parseInt(VE[0]);
		int E = Integer.parseInt(VE[1]);
		
		parent = new int[V+1];
		rank = new int[V+1];
		for(int i=1; i<=V; i++) parent[i] = i;
		
		q = new PriorityQueue<>();
		int s, e, w;
		for(int i=0; i<E; i++) {
			String[] SEW = br.readLine().split(" ");
			s = Integer.parseInt(SEW[0]);
			e = Integer.parseInt(SEW[1]);
			w = Integer.parseInt(SEW[2]);
			q.add(new Edge2(s, e, w));
		}
		
		long result = 0;
		Edge2 now;
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
}

class Edge2 implements Comparable<Edge2> {
	int s;
	int e;
	int w;
	
	Edge2(int s, int e, int w) {
		this.s = s;
		this.e = e;
		this.w = w;
	}
	
	@Override
	public int compareTo(Edge2 o) {
		return this.w-o.w;
	}
}