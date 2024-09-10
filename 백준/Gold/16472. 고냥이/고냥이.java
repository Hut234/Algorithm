import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int max = 0, size, newS = -1;
		boolean isFirst = true;
		Set<Character> set = new HashSet<>();
		for(int s=0, e=0; s<str.length() && e<str.length();) {
			set.add(str.charAt(e));
			size = set.size();
			if(size>N) {
				max = Integer.max(max, e-s);
				if(newS != -1) {
					s = e = newS;
					newS = -1;
					isFirst = true;
				} else {
					s++;
					e = s;
				}
				set.clear();
			} else {
				if(size==2&&isFirst) {
					newS = e;
					isFirst = false;
				}
				e++;
				if(e==str.length()) {
					max = Integer.max(max, e-s);
					break;
				}
			}
		}
		System.out.print(max);
	}
}