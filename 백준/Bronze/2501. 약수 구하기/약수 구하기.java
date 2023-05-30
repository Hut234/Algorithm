import java.io.*;
class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		int idx = 0;
		for(int i=1; i<=N&&K!=0; i++) {
			if(N%i==0) {
				K--;
				idx=i;
			}
		}
		if(K!=0) {
			System.out.println(0);
			return;
		}
		System.out.println(idx);
		
	}
}