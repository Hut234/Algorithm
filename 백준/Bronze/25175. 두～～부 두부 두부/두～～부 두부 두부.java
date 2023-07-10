import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		String[] input = (new BufferedReader(new InputStreamReader(System.in))).readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int K = Integer.parseInt(input[2]);
		while(K<3) K += N;
		int move =  (K-3)%N == 0 ? N : (K-3)%N, result = 0;
		if(N==2){
			if(M==1) {
				if(K%2==0) {
					result = 2;
				} else {
					result = 1;
				}
			} else {
				if(K%2==0) {
					result = 1;
				} else {
					result = 2;
				}
			}
		} else {
			} if(M>=3) {
					if(move >= 0) {
						result = M+move;
					} else {
						result = M-move;
					}
				} else if(M==2) {
					if(move==-1) {
						result = M-move;
					} else if(move==-2) {
						result = N;
					} else {
						result = M+move;
					}
				} else {
					if(move==-1) {
						result = 1;
					} else if(move==-2) {
						result = N;
					} else {
						result = M+move;
					}
				}
		int val = (result-1)%N +1;
		System.out.println( val == 0 ?  N :  val);
	}
}