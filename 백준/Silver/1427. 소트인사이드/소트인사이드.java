import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] N = br.readLine().toCharArray();
		Arrays.sort(N);
		for(int i=N.length-1; i>-1; i--) System.out.print(N[i]);
	}
}