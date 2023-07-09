import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int sum = 0, val, prev = 0, prevSum = 0;
		for(int i=0; i<N; i++) {
			val = Integer.parseInt(input[i]);
			if(val == prev) {
				prevSum *= 2;
				sum += prevSum;
			} else {
				prevSum = 2;
				sum += 2;
			}
			if(sum>=100) {
				prev = 0;
				sum = 0;
			} else {
				prev = val;
			}
		}
		System.out.println(sum);
	}
}