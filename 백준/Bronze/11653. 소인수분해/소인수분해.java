import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int val = N;
		for(int i=2; i<=Math.sqrt(val);) {
			if(N%i==0) {
				N /= i;
				System.out.println(i);
			}else {
				i++;
			}
		}
		if(N!=1) {
			System.out.println(N);
		}
	}
}