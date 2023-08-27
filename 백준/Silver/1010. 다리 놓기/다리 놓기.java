class Main {
	static int[][] arr = new int[31][31];
	public static void main(String[] args) throws Exception {
		for(int i=1; i<31; i++) {
			arr[i][1] = i;
			arr[i][0] = 1;
			arr[i][i] = 1;
		}
		for(int i=2; i<31; i++) {
			for(int j=1; j<31; j++) arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
		}
		int T = read();
		int N, M;
		StringBuilder sb = new StringBuilder();
		while(T-->0) {
			N = read();
			M = read();
			sb.append(arr[M][N]).append("\n");
		}
		System.out.print(sb.deleteCharAt(sb.length()-1).toString());
		
	}
	static int read() throws Exception {
		int c, n = 0;
		while(true) {
			c = System.in.read();
			if(c==13) System.in.read();
			if(c<'0'||c>'9') return n;
			n = n*10 + (c-'0');
		}
	}
}