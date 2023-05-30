import java.io.*;
class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder(br.readLine());
		while(N-->1) {
			String compare = br.readLine();
			for(int i=0; i<sb.length(); i++) if(sb.charAt(i)!=compare.charAt(i)) sb.replace(i, i+1, "?");
		}
		System.out.println(sb);
	}
}