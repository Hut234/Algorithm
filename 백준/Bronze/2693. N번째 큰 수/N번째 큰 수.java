import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(T-->0) {
			Integer[] arr = new Integer[10];
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<10; i++) arr[i] = Integer.valueOf(st.nextToken());
			Arrays.sort(arr, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2-o1;
				}
			});
			bw.write(arr[2] + "\n");
		}
		bw.flush(); bw.close();
	}
}