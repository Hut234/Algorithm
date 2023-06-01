import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
		int H = Integer.parseInt(input[0]);
		int x = Integer.parseInt(input[1]);
		
		int[] amount = new int[H];
		for(int i=0; i<H; i++) amount[i] = Integer.parseInt(br.readLine());
		
        long max = 0;
		long pow = x;
		for(int i=0; i<amount.length; i++) {
			max += (amount[i]*pow);
			max = max%1000000007;
			pow = (pow*x)%1000000007;
		}
		System.out.println(max);
	}
}