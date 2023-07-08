import java.io.*;
class Main {
    static int N, M;
    static int[] ARR;
    static StringBuilder SB = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        ARR = new int[M];
        recur(0, 0);
        System.out.println(SB.toString());
    }   
    
    private static void recur(int idx, int prev) {
    	if(idx == M) {
    		for(int i=0; i<ARR.length; i++) SB.append(ARR[i]).append(" ");
    		SB.append("\n");
    		return;
    	}
    	for(int i=1; i<=N; i++) {
    		if(prev>i) continue;
    		ARR[idx] = i; 
    		recur(idx+1, ARR[idx]);
    		ARR[idx] = 0;
    	}
    }
}