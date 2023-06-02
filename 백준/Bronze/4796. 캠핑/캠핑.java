import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int L, P, V;
		int quotient, remainder;
		int idx = 1;
		while(true) {
            st = new StringTokenizer(br.readLine());
			L = Integer.parseInt(st.nextToken());
			if(L==0) return;
			P = Integer.parseInt(st.nextToken());
			V = Integer.parseInt(st.nextToken());		
			quotient = V/P;
			remainder = V%P > L ? L : V%P;
			System.out.println("Case " + idx++ + ": " + (quotient*L + remainder));
		}
	}
}