import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "+-", true);
		int N = st.countTokens();
		List<Integer> plus = new ArrayList<Integer>();
		List<Integer> minus = new ArrayList<Integer>();
		boolean flag = true;
		String tmp = null;
		for(int i=0; i<N; i++) {
			tmp = st.nextToken();
			if(tmp.equals("+")) {
				continue;
			} else if (tmp.equals("-")) {
				flag = false;
			} else {
				if(flag) {
					plus.add(Integer.parseInt(tmp));
				} else {
					minus.add(Integer.parseInt(tmp));
				}
			}
		}
		int sumPlus = 0, sumMinus = 0;
		for(Integer val : plus) {
			sumPlus += val;
		}
		for(Integer val : minus) {
			sumMinus += val;
		}
		System.out.println(sumPlus-sumMinus);
	}
}