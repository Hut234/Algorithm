import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		boolean[][] chk = new boolean[N][M];
		int cnt = N;
		int i = 0;
		while(cnt-->0) {
			char[] cArr = br.readLine().toCharArray();
			for(int j=0; j<cArr.length; j++) {
				if(cArr[j]=='X') chk[i][j] = true;
			}
			i++;
		}
		int colGuard = 0;
		int rowGuard = 0;
		for(int p=0; p<N; p++) {
			for(int q=0; q<M; q++) {
				if(chk[p][q]==true) break;
				if(q==M-1) rowGuard++;
			}
		}
		for(int q=0; q<M; q++) {
			for(int p=0; p<N; p++) {
				if(chk[p][q]==true) break;
				if(p==N-1) colGuard++;
			}
		}		
		System.out.println(Integer.max(colGuard, rowGuard));
	}
}