import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        
        int max = 0;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    int tmp = Integer.parseInt(s2[i]) + Integer.parseInt(s2[j]) + Integer.parseInt(s2[k]);
                    if(tmp<=M) max = Integer.max(max, tmp);
                }
            }
        }
        System.out.print(max);
    }
}