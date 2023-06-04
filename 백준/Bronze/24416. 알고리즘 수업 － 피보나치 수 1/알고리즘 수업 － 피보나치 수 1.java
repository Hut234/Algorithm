import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fib(n) + " " + (n-2));
	}
	private static int fib(int n) {
		if(n==1 || n==2) return 1;
		else return (fib(n-1) + fib(n-2));
	}
}