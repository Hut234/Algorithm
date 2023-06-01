import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int totCnt = 0;
		int cnt;
		int val;
		for(int i=0; i<N; i++) {
			val = Integer.parseInt(input[i]);
			cnt = 0;
			for(int j=2; j<=Math.sqrt(val)&&cnt==0; j++) {
				if(val%j==0) cnt++;
			}
			if(val!=1&&cnt==0) totCnt++;
		}
		System.out.println(totCnt);
	}
}