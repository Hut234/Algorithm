import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int n = Integer.parseInt(input[2]);
		int w = Integer.parseInt(input[3]);
		int cnt = 0;
		int[] result = new int[2];
        for(int i=1,idx=0; i<=1000; i++) {
			for(int j=1; j<=1000; j++) {
				if(i+j==n) {
					if(a*i+b*j==w) {
						if(cnt==0) {
							result[idx++] = i;
							result[idx] = j;
							cnt++;
						} else {
							System.out.println(-1);
							return;
						}
					}
				}
			}
			if(i==1000&&cnt==1) {
				System.out.println(result[0] + " " + result[1]);
				return;
			}
		}
		System.out.println(-1);
	}
}