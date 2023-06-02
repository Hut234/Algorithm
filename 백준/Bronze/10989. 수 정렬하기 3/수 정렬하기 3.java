import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] check = new int[10001];
		for(int i=0; i<N; i++) 
			check[Integer.parseInt(br.readLine())]++;
		for(int i=1; i<=10000&&N!=0; i++)
			if(check[i]!=0) {
				for(;check[i]>0; check[i]--) {
					bw.write(i + "\n");
					N--;
				}
			}
		bw.flush(); bw.close();
	}
}