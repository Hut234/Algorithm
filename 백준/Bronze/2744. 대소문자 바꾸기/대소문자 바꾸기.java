import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i;
		while((i=br.read()) >= 65) {
			if(i>=97) sb.append((char)(i-32));
			else sb.append((char)(i+32));
		}
		System.out.println(sb.toString());
	}
}