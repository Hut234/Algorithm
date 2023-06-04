import java.io.*;
class Main {
	static int CNTDYNAMIC = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int recursionCnt = 2 + (n-3)*(n-2)/2;
		fibonacci(n);
		System.out.println(fib(n) + " " + CNTDYNAMIC);
	}
	private static int fib(int n) {
		if(n==1 || n==2) return 1;
		else return (fib(n-1) + fib(n-2));
	}
	private static int fibonacci(int n) {
		int[] f = new int[n];
		f[0] = 1; f[1] = 1;
		for(int i=2; i<n; i++) {
			CNTDYNAMIC++;
			f[i] = f[i-1] + f[i-2];
		}
		return f[n-1];
	}
}