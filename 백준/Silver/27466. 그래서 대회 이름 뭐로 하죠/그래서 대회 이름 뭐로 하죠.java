import java.util.*;
import java.io.*;
class Main{
    private static List<String> AAC = new ArrayList<>();
	private static int ACOUNT = 2;
	private static int CCOUNT = 1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		StringBuilder sb = new StringBuilder();
		while(N-->0) {
			char c = (char)br.read();
			if(check(c)) sb.append(c);
		}
		
		if(ACOUNT + CCOUNT != 0) {
			System.out.println("NO");
			return;
		}
		
		AAC.sort(Comparator.naturalOrder());

		if(M == 3) {
			sb.setLength(0);
            System.out.println("YES");
			System.out.print(sb.append(AAC.get(0)).append(AAC.get(1)).append(AAC.get(2)));
			return;
		}
		String tmp = sb.substring(0, M-3);
		sb.setLength(0);
		sb.append(tmp).append(AAC.get(0)).append(AAC.get(1)).append(AAC.get(2));
        System.out.println("YES");
		System.out.print(sb);
	}
    private static boolean check(char c) {
		if(ACOUNT == 0 && CCOUNT == 0) return true;
		if(ACOUNT != 0 && CCOUNT == 0) {
			if(c == 'A') {
				AAC.add(String.valueOf(c));
				ACOUNT--;
				return false;
			} else {
				return true;
			}
		}
		if(ACOUNT == 0 && CCOUNT != 0) {
			if(c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
				AAC.add(String.valueOf(c));
				CCOUNT--;
				return false;
			} else {
				return true;
			}
		}
		switch(c) {
			case 'A': 
				AAC.add(String.valueOf(c));
				ACOUNT--;
				return false;
			case 'E':  case 'I':  case 'O':  case 'U': return true;
			default : 
				AAC.add(String.valueOf(c));
				CCOUNT--;
				return false;
		}
    }
	
}