import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int H = Integer.parseInt(input[1]);
		int[] odd = new int[H+1], even = new int[H+1];
		for(int i=1; i<=N/2; i++) {
			odd[Integer.parseInt(br.readLine())]++;
			even[H-Integer.parseInt(br.readLine()) +1]++;
		}
		for(int i=H-1; i>0; i--) odd[i] += odd[i+1];
		for(int i=1; i<=H; i++) even[i] += even[i-1];
		int cnt = Integer.MAX_VALUE, sameCnt = 0;
		for(int i=1; i<=H; i++) {
			if(cnt > odd[i] + even[i]) {
				sameCnt = 1;
				cnt = odd[i] + even[i];
			} else if(cnt == odd[i] + even[i]) sameCnt++; 
		}
		System.out.println(cnt + " " + sameCnt);
	}
}