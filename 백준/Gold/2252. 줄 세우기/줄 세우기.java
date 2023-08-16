import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		int N = read();
		int M = read();
		List<Integer>[] al = new ArrayList[N+1];
		for(int i=1; i<=N; i++) al[i] = new ArrayList<>();
		int[] indegree = new int[N+1];
		int shorter, taller;
		while(M-->0) {
			shorter = read();
			taller = read();
			al[shorter].add(taller);
			indegree[taller]++;
		}
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=N; i++) if(indegree[i]==0) q.offer(i);
		StringBuilder sb = new StringBuilder();
		int node;
		while(!q.isEmpty()) {
			node = q.poll();
			sb.append(node).append(" ");
			for(Integer i : al[node]) {
				indegree[i]--;
				if(indegree[i]==0) q.offer(i);
			}
		}
		System.out.print(sb.deleteCharAt(sb.length()-1).toString());
	}
	static int read() throws Exception{
		int c, n = 0;
		while(true) {
			c = System.in.read() -48;
			if(c<0 || c>9) return n;
			n = n*10 +c;
		}
	}
}