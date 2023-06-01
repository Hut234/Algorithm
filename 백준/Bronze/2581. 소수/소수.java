import java.io.*;
class Main{
    	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int cnt;
		int min = N+1;
		for(;M<=N;M++) {
			cnt = 0;
			for(int i=2; i<=Math.sqrt(M)&&cnt==0; i++) {
				if(M%i==0) cnt++;
			}
			if(M!=1&&cnt==0) {
				sum += M;
				min = Integer.min(min, M);
			}
		}
		if(min != N+1) {
			System.out.println(sum);
			System.out.println(min);
		}else {
			System.out.println(-1);
		}
	}
}