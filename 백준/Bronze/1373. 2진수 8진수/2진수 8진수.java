import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int times = 1;
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for(int i=input.length()-1, cnt=1; i>-1; i--, cnt++) {
			sum += times*(input.charAt(i)-'0');
			if(cnt%3==0) {
				sb.append(sum);
				times = 1;
				sum = 0;
				continue;
			} 
            else times*=2;
			if(i==0&&cnt%3!=0) sb.append(sum);
		}
		sb.reverse();
		System.out.println(sb);
	}
}