import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = N;
        
        int[] weight = new int[N];
        int[] height = new int[N];
        int i=0;
        int j=0;
        
        StringTokenizer st;
        while(cnt-->0){
            st = new StringTokenizer(br.readLine());
            weight[i++] = Integer.parseInt(st.nextToken());
            height[j++] = Integer.parseInt(st.nextToken());
        }
        
        int[] rank = new int[N];
        for(int p=0; p<N; p++) {
            for(int q=0; q<N; q++){
                if(weight[p]<weight[q] && height[p]<height[q]){
                    rank[p]++;
                }
            }
        }
        for(int val : rank) {
            System.out.print(val+1 + " ");
        }
    }
}