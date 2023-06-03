import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, N = 10, prev = 0;
		while(N-->0) {
			prev = sum;
			sum += Integer.parseInt(br.readLine());
			if(sum>100) {
				if(100-prev != sum-100) {
					System.out.println(100-prev<sum-100? prev : sum);
					return;
				} else {
					System.out.println(sum);
					return;
				}
			} else if(sum==100) {
				System.out.println(sum);
				return;
			}
		}
        System.out.println(sum);
	}
}