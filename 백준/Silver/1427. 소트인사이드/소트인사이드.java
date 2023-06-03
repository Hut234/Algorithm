import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] N = br.readLine().toCharArray();
		Arrays.sort(N);
		System.out.println(new StringBuilder(new String(N)).reverse().toString());
	}
}