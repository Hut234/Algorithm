import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] HW = br.readLine().split(" ");
		int H = Integer.parseInt(HW[0]);
		int W = Integer.parseInt(HW[1]), w = 0;
		int[] height = new int[W];
		String[] input = br.readLine().split(" ");
		int minus = 0, chk=0;
		while(w!=W) {
			height[w] = Integer.parseInt(input[w]);
			minus += height[w];
			if(height[w]>0) chk++;
			w++;
		}
		if(chk<2) {
			System.out.println(0);
			return;
		}
		int sum = 0, min, max;
		for(int i=H; i>0; i--) {
			min = max = 0;
			for(int j=0; j<W; j++) {
				if(height[j]>=i) {
					min = j;
					break;
				}
			}
			for(int k=W-1; k>-1; k--) {
				if(height[k]>=i) {
					max = k;
					break;
				}
			}
            if(min==0&&max==0) continue;
			if(min==max) {
				sum++;
			} else {
				sum += max-min+1;
			}
		}
		System.out.println(sum - minus);
	}
}