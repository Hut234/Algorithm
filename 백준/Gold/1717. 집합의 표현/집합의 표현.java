class Main {
	static int[] graph;
	static int[] rank;
	public static void main(String[] args) throws Exception {
		int n = read();
		int m = read();
		
		graph = new int[n+1];
		rank = new int[n+1];
		for(int i=0; i<=n; i++) {
			graph[i] = i;
			rank[i] = 1;
		}
		int o, a, b;
		while(m-->0) {
			o = read();
			a = read();
			b = read();
			if(o==0) union(a, b);
			else System.out.println(find(a)==find(b) ? "YES" : "NO");
		}
		
	}
	static void union(int a, int b) {
		int findA = find(a);
		int findB = find(b);
		if(findA==findB) return;
		if(rank[a]==rank[b]) {
			graph[findA] = findB;
			rank[b] += 1;
		} else if(rank[a]>rank[b]) graph[findB] = findA;
		else graph[findA] = findB;
	}
	static int find(int val) {
		if(graph[val]==val) return val;
		else return graph[val] = find(graph[val]);
	}
    static int read() throws Exception {
        int c, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }
}