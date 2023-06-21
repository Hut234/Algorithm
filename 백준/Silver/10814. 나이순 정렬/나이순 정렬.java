import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		List<List<String>> list = new ArrayList<>();
		for(int i=0; i<=100000; i++) {
			list.add(new ArrayList<>());
		}
		int age;
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			list.get(age).add(name);
		}
		int idx = 0;
		for(List<String> li : list) {
			if(li.size()!=0) {
				for(int i=0; i<li.size(); i++) {
					System.out.println(idx + " " + li.get(i));
				}
			}
			idx++;
		}
	}
}