import java.io.*;
import java.util.*;
class Main {
	static int N, COST = Integer.MAX_VALUE;
	static boolean CHK_FIRST = true;
	static int[] RESULT = new int[5];
	static int[] MIN = new int[4];
	static int[][] INFO;
	static List<Integer> LIST = new ArrayList<>();
	static List<Integer> MIN_LIST;
	static StringBuilder SB = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) MIN[i] = Integer.parseInt(st.nextToken());
		INFO = new int[N][5];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				INFO[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		recur(0);
		System.out.println(COST);
        if(SB.length()!=0)
			System.out.println(SB.toString());
 	}
	
	private static void recur(int idx) {
		if(COST==-1) return;
		if(idx == N) {
			if(RESULT[0] >= MIN[0] && RESULT[1] >= MIN[1] && RESULT[2] >= MIN[2] && RESULT[3] >= MIN[3]) {
				if(CHK_FIRST) CHK_FIRST = false;
				if(COST>RESULT[4]) {
					COST = RESULT[4];
					MIN_LIST = new ArrayList<>();
					SB.setLength(0);
					Iterator<Integer> iter = LIST.iterator();
					int val;
					while(iter.hasNext()) {
						val = iter.next()+1;
						MIN_LIST.add(val);
						SB.append(val).append(" ");
					}
				} else if(COST==RESULT[4]) {
					boolean change = false;
					if(LIST.size() == MIN_LIST.size()) {
						for(int i=0; i<LIST.size(); i++) {
							if(MIN_LIST.get(i) > (LIST.get(i)+1)) {
								change = true;
								return;
							} else if(MIN_LIST.get(i) == (LIST.get(i)+1)) {
								continue;
							} else {
								return;
							}
						}
					} else {
						int size = LIST.size() < MIN_LIST.size() ? LIST.size() : MIN_LIST.size();
						for(int i=0; i<size; i++) {
							if(i==size-1 && size == LIST.size()) change = true;
							if(MIN_LIST.get(i) > (LIST.get(i)+1)) {
								change = true;
								return;
							} else if(MIN_LIST.get(i) == (LIST.get(i)+1)) {
								continue;
							} else {
								return;
							}
						}
					}
					if(change) {
						SB.setLength(0);
						MIN_LIST.clear();
						Iterator<Integer> iter = LIST.iterator();
						int val;
						while(iter.hasNext()) {
							val = iter.next()+1;
							SB.append(val).append(" ");
							MIN_LIST.add(val);
						}
					}
				}
			} else {
				if(CHK_FIRST) {
					COST = -1;
					CHK_FIRST = false;
				}
			}
			return;
		}
		LIST.add(idx);
		for(int i=0; i<5; i++) {
			RESULT[i] += INFO[idx][i];
		}
		recur(idx+1);
		LIST.remove(LIST.size()-1);
		for(int i=0; i<5; i++) {
			RESULT[i] -= INFO[idx][i];
		}
		recur(idx+1);
	}
}