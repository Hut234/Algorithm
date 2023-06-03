import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] N = br.readLine().toCharArray();
		Arrays.sort(N);
		for(int i=N.length-1; i>-1; i--) bw.write(N[i]);
		bw.flush(); bw.close();
	}
}