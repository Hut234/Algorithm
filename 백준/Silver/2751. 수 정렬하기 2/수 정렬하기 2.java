import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		boolean[] check = new boolean[2000001];
		for(int i=0; i<N; i++) 
			check[Integer.parseInt(br.readLine())+1000000] = true;
		for(int i=0; i<=2000000&&N!=0; i++)
			if(check[i]==true) {
				bw.write(i-1000000 + "\n");
				N--;
			}
		bw.flush(); bw.close();
	}
}