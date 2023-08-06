import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] vals = new int[N];
		for(int i=0; i<N; i++) vals[i] = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int tmp;
		for(int i=N; i>1; i--) {
			for(int j=0; j<i-1; j++) {
				tmp = vals[j];
				if(tmp > vals[j+1]) {
					vals[j] = vals[j+1];
					vals[j+1] = tmp;
				}
			}
		}
		for(int i : vals) sb.append(i).append("\n");
		System.out.println(sb.toString());
	}
}