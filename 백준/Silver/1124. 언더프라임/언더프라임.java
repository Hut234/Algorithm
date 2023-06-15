import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		String[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		boolean[] prime = new boolean[B+1];
		for(int i=2; i<=Math.sqrt(B); i++) for(int j=i*i; j<=B; j+=i) if(!prime[j]) prime[j] = true;
		int cnt = 0, curCnt, tmp;
		for(int i=A; i<=B; i++) {
			if(prime[i]) {
				curCnt = 0;
				tmp = i;
				for(int j=2; j<=Math.sqrt(i); j++) {
					if(!prime[j]) {
						for(;;) {
							if(tmp%j==0) {
								curCnt++;
								tmp /= j;
							}
							else break;
						}
					}
					if(!prime[tmp]) break;
				}
				if(tmp!=1&&!prime[tmp]) curCnt++;
				if(!prime[curCnt]) cnt++;
			}
		}
		System.out.println(cnt);
	}
}