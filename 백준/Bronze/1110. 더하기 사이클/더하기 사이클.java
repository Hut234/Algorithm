import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean flag = false;
		int newN = N;
		int cnt = 0;
		while(!flag) {
			int sum = newN/10 + newN%10;
			newN = newN%10*10 + sum%10;
			if(newN==N) {
				flag = true;
			}
			cnt++;
		}
		System.out.println(cnt);
    }
}