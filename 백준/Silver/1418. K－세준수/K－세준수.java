import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int cnt = 1;
		boolean flag;
		for(int i=2; i<=N; i++) {
			flag = false;
			int newVal=0;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j==0) {
					int val = i/j;
					for(int k=j; k<=Math.sqrt(val);) {
						if(val%k==0) {
							newVal = val/k;
							val /= k;
						}
						else k++;
					}
					if(newVal==0) newVal = val;
					flag = true;
				}
				if(flag) break;
			}
			if(newVal==0) {
				newVal = i;
			}
			if(newVal<=K) cnt++;
		}
		System.out.println(cnt);
	}
}