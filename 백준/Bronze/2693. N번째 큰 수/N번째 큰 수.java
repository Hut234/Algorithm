import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(T-->0) {
			List<Integer> list = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<10; i++) list.add(Integer.parseInt(st.nextToken()));
			Collections.sort(list);
			bw.write(list.get(7) + "\n");
		}
		bw.flush(); bw.close();
	}
}