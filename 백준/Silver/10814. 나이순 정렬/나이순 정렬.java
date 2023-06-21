import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder[] sbArr = new StringBuilder[201];
		StringTokenizer st;
		int age;
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			age = Integer.parseInt(st.nextToken());
			if(sbArr[age]==null) sbArr[age] = new StringBuilder();
			sbArr[age].append(age).append(" ").append(st.nextToken()).append("\n");
		}
		for(StringBuilder sb : sbArr) {
			if(sb!=null) System.out.print(sb.toString());
		}
	}
}