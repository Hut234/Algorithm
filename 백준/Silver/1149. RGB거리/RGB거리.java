import java.io.*;
class Main {
	private static int N;
	private static int[][] DP;
	private static int [][]  RGB;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		RGB = new int[N+1][3];
		DP = new int[N+1][3];
		for(int i=1; i<=N; i++) {
			String[] rgb = br.readLine().split(" ");
			RGB[i][0] = Integer.parseInt(rgb[0]);
			RGB[i][1] = Integer.parseInt(rgb[1]);
			RGB[i][2] = Integer.parseInt(rgb[2]);
		}
		for(int i=1; i<=N; i++) {
			for(int j=0; j<3; j++) {
				if(j==0) {
					DP[i][j] = Integer.min(DP[i-1][1], DP[i-1][2]) + RGB[i][j];
				}
				if(j==1) {
					DP[i][j] = Integer.min(DP[i-1][0], DP[i-1][2]) + RGB[i][j];
				}
				if(j==2) {
					DP[i][j] = Integer.min(DP[i-1][0], DP[i-1][1]) + RGB[i][j];
				}
			}
		}
        int min = Integer.MAX_VALUE;
		for(int i=0; i<3; i++) {
			min = Integer.min(min, DP[N][i]);
		}
		System.out.println(min);
	}
}