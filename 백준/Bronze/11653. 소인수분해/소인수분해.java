import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int val = N;
		while(N!=1) {
			for(int i=2; i<=val;) {
				if(N%i==0) {
					N /= i;
					System.out.println(i);
				}else {
					i++;
				}
			}
		}
	}
}