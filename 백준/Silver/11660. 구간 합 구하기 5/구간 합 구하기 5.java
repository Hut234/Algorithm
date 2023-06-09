import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        //table size
        int N = Integer.parseInt(input[0]), cur;
        int[][] prev = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            String[] val = br.readLine().split(" ");
            cur = 0;
            //완성된 부분합 테이블
            for(int j=1; j<=N; j++){
                prev[i][j] = prev[i-1][j] + prev[i][j-1] + Integer.parseInt(val[cur++]) - prev[i-1][j-1];
            }
        }
        //coords
        int M = Integer.parseInt(input[1]);
        while(M-->0){
            String[] coords = br.readLine().split(" ");
            int x1 = Integer.parseInt(coords[0]);
            int y1 = Integer.parseInt(coords[1]);
            int x2 = Integer.parseInt(coords[2]);
            int y2 = Integer.parseInt(coords[3]);
            sb.append(prev[x2][y2] - prev[x1-1][y2] - prev[x2][y1-1] + prev[x1-1][y1-1]).append("\n");
        }
        System.out.print(sb.toString());
    }
}