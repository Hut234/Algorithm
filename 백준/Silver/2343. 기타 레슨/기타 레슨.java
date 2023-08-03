import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int idx=0, tmp, max=0, sum=0;
		int[] vals = new int[N];
		while(st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			vals[idx++] = tmp;
			sum += tmp;
			max = Integer.max(max, tmp);
		}
		
		int start=max, end=sum, mid, disc, len;
		List<Integer> list = new ArrayList<>();
		while(start<=end) {
			disc = 1;
			len = 0;
			mid = (start+end) /2;
			
			for(int i=0; i<N; i++) {
				len += vals[i];
				if(len>mid) {
					len = vals[i];
					disc++;
				}
			}
			if(disc>M) {
				start = mid+1;
			} else {
				list.add(mid);
				end = mid-1;
			}
		}
		System.out.println(Collections.min(list));
	}
}