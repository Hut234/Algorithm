import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]); 
		int M = Integer.parseInt(NM[1]); 
		boolean[] row = new boolean[N];
		boolean[] col = new boolean[M];
		
		for(int i=0; i<N; i++) {
			char[] guard = br.readLine().toCharArray();
			for(int j=0; j<M; j++) {
				if(guard[j]=='X') {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		int rGuard = 0;
		for(int i=0; i<N; i++) {
			if(!row[i]) rGuard++;
		}
		int cGuard = 0;
		for(int i=0; i<M; i++) {
			if(!col[i]) cGuard++;
		}
		System.out.println(Integer.max(rGuard, cGuard));
    }
}