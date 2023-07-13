import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
       int N = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
		int diff;
		for(int i=N; i>0; i--) {
			diff = N-i;
            while(diff>0) {
                System.out.print(" ");
                diff--;
            }
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}