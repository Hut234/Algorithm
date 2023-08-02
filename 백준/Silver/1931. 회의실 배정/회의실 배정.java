import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Meeting[] meetings = new Meeting[N];
		for(int i=0; i<N; i++) {
			String[] input = br.readLine().split(" ");
			meetings[i] = new Meeting(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		}
		Arrays.sort(meetings);
        int tmp = meetings[0].end;
        int cnt = 1;
        for(int j=1; j<N; j++) {
            if(meetings[j].start>=tmp) {
                cnt++;
                tmp = meetings[j].end;
            }
        }
        System.out.println(cnt);
	}
}
class Meeting implements Comparable<Meeting> {
	int start;
	int end;
	public Meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(Meeting o) {
		if(this.end == o.end) return this.start - o.start;
		else return this.end - o.end;
	}
}