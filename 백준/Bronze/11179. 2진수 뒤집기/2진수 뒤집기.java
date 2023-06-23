import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int result = 0, tmp;
		while(N!=0) {
			tmp = N%2;
			result = result*2 + tmp;
			N/=2;
		}
		System.out.println(result);
	}
}