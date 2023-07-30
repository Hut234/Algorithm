import java.io.*;
import java.util.*;
class Main {
	private static int N, M;
	private static int [] DX = {0, 0, -1, 1};
	private static int [] DY = {1, -1, 0, 0};
	private static boolean[][] VISITED;
	private static int[][] INFO;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		VISITED = new boolean[N][M];
		INFO = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String[] str = br.readLine().split("");
			for(int j=0; j<M; j++) {
				if(str[j].equals("1")) INFO[i][j] = 1;
			}
		}
		bfs(0, 0);
		System.out.println(INFO[N-1][M-1]);
	}
	private static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		VISITED[x][y] = true;
		
		q.offer(new int[] {x, y});
		int[] cur;
		int moveX, moveY;
		while(!q.isEmpty()) {
			cur = q.poll();
			//상하좌우 탐색
			for(int i=0; i<4; i++) {
				moveX = cur[0] + DX[i];
				moveY = cur[1] + DY[i];
				
				//좌표 범위 유효성 검사 : 0~N-1 까지 범위 가능
				if(moveX>=0 && moveX<N && moveY>=0 && moveY<M) {
					//이동 가능한지 확인
					if(INFO[moveX][moveY]==1 && !VISITED[moveX][moveY]) {
						VISITED[moveX][moveY] = true;
						INFO[moveX][moveY] = INFO[cur[0]][cur[1]] +1;
						q.offer(new int[] {moveX, moveY});
					}
				}
				
			}
		}
	}
}