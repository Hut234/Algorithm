import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		long A = Long.parseLong(input[0]);
		long B = Long.parseLong(input[1]);
		System.out.println(cnt(B)-cnt(A-1));
	}
	private static long cnt(long val) {
		int maxE = maxE(val);
		long cnt = 0;
		long prevCnt = 0;
		long result = 0;
		long pow;
		for(;maxE>-1;) {
			pow = (long)Math.pow(2, maxE);
			cnt = val/pow;
			result += (cnt-prevCnt)*pow;
			prevCnt += cnt-prevCnt;
			maxE--;
		}
		return result;
	}
	private static int maxE(long val) {
		int maxE = 0;
		for(;;) {
			if((long)Math.pow(2, maxE)<=val) maxE++;
			else {
				maxE--;
				break;
			}
		}
		return maxE;
	}
}