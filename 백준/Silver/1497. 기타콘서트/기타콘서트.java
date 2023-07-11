import java.io.*;
import java.util.*;
class Main {
	static String[] YN;
	static int Y_CNT, MIN_CNT, CNT;
	static int N, M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		YN = new String[N];
		for(int i=0; i<N; i++) YN[i] = br.readLine().split(" ")[1];
		recur(0, "");
		System.out.println(MIN_CNT);
	}
	private static void recur(int idx, String str) {
		if(idx==N) {
			if(str.length()==0) {
				return;
			} else {
				String[] separate = new String[str.length()/M];
				for(int i=0, start=0; i<separate.length; i++, start+=M) {
					separate[i] = str.substring(start, start+M);
				}
				int cntY = 0, guitar = 0;
				char[] chk = new char[M];
				Arrays.fill(chk, 'N');
				for(int i=0; i<separate.length; i++) {
					guitar++;
					for(int j=0; j<M; j++) {
						if(chk[j]=='N') {
							if(separate[i].charAt(j)=='Y') {
								chk[j] = 'Y';
								cntY++;
							}
						}
					}
				}
				if(str.length()==N*M&&cntY==0) {
					MIN_CNT = -1;
				} else {
					if(Y_CNT<cntY) {
						Y_CNT = cntY;
						MIN_CNT = guitar;
					} else if(Y_CNT==cntY) {
						MIN_CNT = Integer.min(MIN_CNT, guitar);
					}
				}
			}
			return;
		}
		recur(idx+1, str+YN[idx]);
		recur(idx+1, str);
	}
}