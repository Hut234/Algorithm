import java.io.*;
import java.util.*;
class Main {
	static List<Integer> list = new ArrayList<>();
	static List<String> result = new ArrayList<>();
	static String[] signs;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine());
		signs = br.readLine().split(" ");
		recur(0, K+1);
		System.out.println(result.get(result.size()-1));
		System.out.println(result.get(0));
	}
	private static void recur(int start, int end) {
		if(start == end) {
			boolean flag = true;
			for(int i=0; i<signs.length; i++) {
				if(signs[i].equals("<")) {
					if(list.get(i)<list.get(i+1)) continue;
					else {
						flag = false;
						break;
					}
				} else {
					if(list.get(i)>list.get(i+1)) continue;
					else {
                        flag = false;
						break;
					}
				}
			}
			if(flag) {
				Iterator<Integer> iter = list.iterator();
				StringBuilder sb = new StringBuilder();
				while(iter.hasNext()) {
					sb.append(iter.next());
				}
				result.add(sb.toString());
			}
			return;
		}
		for(int i=0; i<=9; i++) {
			if(list.contains(i)) continue;
			list.add(i);
			recur(start+1, end);
			list.remove(list.indexOf(i));
		}
	}
}