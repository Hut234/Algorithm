import java.io.*;
import java.util.*;
class Main {	
    static List<ArrayList<Integer>> ALIST = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = N;
		for(int i=0; i<=200000; i++) ALIST.add(new ArrayList<>());
		StringTokenizer st;
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			ALIST.get(Integer.parseInt(st.nextToken())+100000).add(Integer.parseInt(st.nextToken()));
		}
		for(int i=0; i<=200000; i++) ALIST.get(i).sort(null);
		for(int i=0; i<ALIST.size(); i++) {
			for(int j=0; j<ALIST.get(i).size(); j++) {
				if(cnt==0) return;
				if(ALIST.get(i).get(j)!=null) {
					System.out.println((i-100000) + " " + ALIST.get(i).get(j));
					cnt--;
				}
			}
		}
    }
}