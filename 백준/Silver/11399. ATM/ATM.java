import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] vals = new int[N];
		String[] input = br.readLine().split(" ");
		for(int i=0; i<N; i++) vals[i] = Integer.parseInt(input[i]);
		
		int insertPoint;
		for(int i=1; i<N; i++) {
			insertPoint = 0;
			for(int j=i-1; j>-1; j--) {
				if(vals[i]>vals[j]) {
					insertPoint = j+1;
					break;
				}
			}
			int tmp = vals[i];
			for(int j=i-1; j>=insertPoint; j--) {
				vals[j+1] = vals[j];
			}
			vals[insertPoint] = tmp;
		}
		int sum = vals[0], prefix = 0;
		for(int i=1; i<N; i++) {
			prefix += vals[i-1];
			sum += vals[i] + prefix;
		}
		System.out.print(sum);
	}
}