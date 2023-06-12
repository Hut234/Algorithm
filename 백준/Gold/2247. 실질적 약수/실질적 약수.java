import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		System.out.println(csod(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
	}
	private static long csod(int val) {
		long result = 0;
		for(int i=2; i<=val/2; i++) {
			result += ((val/i)-1)*i;
		}
		return result%1000000;
	}
}