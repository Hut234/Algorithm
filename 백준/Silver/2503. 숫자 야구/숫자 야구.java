import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), n = N;
		StringTokenizer st;
		String[] val = new String[N]; int[] strk = new int[N], ball = new int[N]; 
		int idx=0, strkCnt, ballCnt, ans=0;
		boolean flag;
		while(n-->0) {
			st = new StringTokenizer(br.readLine());
			val[idx] = st.nextToken();
			strk[idx] = Integer.parseInt(st.nextToken());
			ball[idx++] = Integer.parseInt(st.nextToken());
		}
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				if(i==j) continue;
				for(int k=1; k<10; k++) {
					if(i==k||j==k) continue;
					flag = true;
					for(int l=0; l<N; l++) {
						strkCnt = 0; ballCnt = 0;
						int a = val[l].charAt(0)-'0';
						int b = val[l].charAt(1)-'0';
						int c = val[l].charAt(2)-'0';
						if(a==i) strkCnt++;
						if(b==j) strkCnt++;
						if(c==k) strkCnt++;
						if(i!=a&&i==b||i==c) ballCnt++;
						if(j!=b&&j==a||j==c) ballCnt++;
						if(k!=c&&k==a||k==b) ballCnt++;
						if(strk[l]!=strkCnt||ball[l]!=ballCnt) {
							flag =false;
							break;
						}
					}
					if(flag) ans++;
				}
			}
		}
		System.out.println(ans);
	}
}