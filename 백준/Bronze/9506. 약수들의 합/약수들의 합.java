import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb;
		boolean isPerfect = true;
		int sum;
		while(n!=-1) {
			sb = new StringBuilder(n + " = ");
			sum = 0;
			for(int i=1; i<n; i++) {
				if(n%i==0) {
					sb.append(i).append(" + ");
					sum += i;
				}
			}
			if(sum == n) {
				sb.delete(sb.lastIndexOf("+")-1, sb.lastIndexOf("+")+1);
				System.out.println(sb);
			}else {
				System.out.println(n + " is NOT perfect.");
			}
			n = Integer.parseInt(br.readLine());
		}
	}
}