import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int calc = 4*A*A -(4*B);
		int result1 = (int) (-2*A + Math.sqrt(calc))/2;
		int result2 = (int) (-2*A - Math.sqrt(calc))/2;
		System.out.println(result1 != result2 ? result2 + " " + result1 : result1);
	}
}