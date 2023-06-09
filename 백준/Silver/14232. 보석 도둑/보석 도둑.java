import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		Long K = Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=2; i<=Math.sqrt(K); i++) {
			for(;;) {
				if(K%i==0) {
					sb.append(i).append(" ");
					K /= i;
					cnt++;
				}
				else break;
			}
		}
		if(K!=1) {
            sb.append(K);
            cnt++;
        }
		System.out.println(cnt);
		System.out.println(sb.toString());
	}
}