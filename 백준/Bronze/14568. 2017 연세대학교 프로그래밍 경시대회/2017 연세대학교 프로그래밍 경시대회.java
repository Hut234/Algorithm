import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int A = 2, B = 1, C, cnt = 0;
		for(int i=A;i<=N-3;i+=2) {
			for(int j=B;i+j<=N-2;j++) {
				for(int k=j+2; k<N; k++) {
					if(i+j+k==N) cnt++;
					else if(i+j+k>N) break;
				}
			}
		}
		System.out.println(cnt);
	}
}