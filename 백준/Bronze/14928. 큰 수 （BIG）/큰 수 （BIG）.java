import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int div = 20000303, i;
		long remainder = 0;
		while((i=br.read()-'0')>=0) remainder = (remainder*10 +i)%div;
		System.out.println(remainder);
	}
}