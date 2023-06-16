import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), n = N;
		int[] coords = new int[1001];
		int max = 0, maxCnt = 1, tmp;
		while(n-->0) {
			String[] input = br.readLine().split(" ");
			tmp = Integer.parseInt(input[1]);
			coords[Integer.parseInt(input[0])] = tmp; 
			if(max==tmp) maxCnt++;
			if(max<tmp) maxCnt = 1;
			max = Integer.max(tmp, max);
			
		}
		int sum = 0, prevHeight = 0;
		for(int i=0; i<=1000&&maxCnt!=0; i++) {
			if(coords[i]==max) {
				maxCnt--;
			}
			if(coords[i]!=0&&prevHeight<coords[i]) {
				prevHeight = coords[i];
				sum += coords[i];
			} else {
				sum += prevHeight;
			}
		}
		int prevHeight2 = 0;
		for(int i=1000; i>-1; i--) {
			if(coords[i]==max) break;
			if(coords[i]!=0&&prevHeight2<coords[i]) {
				prevHeight2 = coords[i];
				sum += coords[i];
			} else {
				sum += prevHeight2;
			}
		}
		System.out.println(sum);
	}
}