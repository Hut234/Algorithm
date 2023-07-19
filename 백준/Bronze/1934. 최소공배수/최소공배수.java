import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int A, B;
		while(T-->0) {
			String[] input = br.readLine().split(" ");
			A = Integer.parseInt(input[0]);
			B = Integer.parseInt(input[1]);
			sb.append(lcm(A, B)).append("\n");
		}
		System.out.println(sb.toString());
	}
	private static int gcd(int a, int b) {
		if(b==0) return a;
		else return gcd(b, a%b);
	}
	private static int lcm(int a, int b) {
		return a*b /gcd(a, b);
	}
}