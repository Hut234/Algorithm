import java.io.*;
import java.util.*;
class Main {
	static int[] graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		graph = new int[n+1];
		for(int i=0; i<=n; i++) graph[i] = i;
		
		StringTokenizer st;
		int o, a, b;
		while(m-->0) {
			st = new StringTokenizer(br.readLine());
			o = Integer.parseInt(st.nextToken());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if(o==0) union(a, b);
			else System.out.println(find(a)==find(b) ? "YES" : "NO");
		}
	}
	static void union(int a, int b) {
		graph[find(a)] = find(b);
	}
	static int find(int val) {
		if(graph[val]==val) return val;
		else return graph[val] = find(graph[val]);
	}
}