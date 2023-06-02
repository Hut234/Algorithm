import java.io.*;
class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		bw.write(String.valueOf(rev(String.valueOf(rev(input[0]) + rev(input[1])))));
		bw.flush(); bw.close();
	}
	
	private static int rev(String str) {
		int rev = 0;
		int times = 1;
		for(int i=0; i<str.length(); i++, times*=10) {
			rev += times* (str.charAt(i)-'0');
		}
		return rev;
	}
}