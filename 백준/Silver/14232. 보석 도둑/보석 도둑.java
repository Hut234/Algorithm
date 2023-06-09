import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
	Long K = Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine());
		long divisor = 2, cnt = 0;
		StringBuilder sb = new StringBuilder();
		while(true) {
			if(K==1) break;
            if (divisor>=1000000) {
				sb.append(K);
				cnt++;
				break;
			}	
			if(K%divisor==0) {
				cnt++;
				K /= divisor;
				sb.append(divisor).append(" ");
			}
            else divisor++;
		}
		System.out.println(cnt);
		System.out.println(sb);
	}
}