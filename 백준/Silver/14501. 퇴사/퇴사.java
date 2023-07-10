import java.io.*;
import java.util.*;
class Main{
    static int N, result;
    static int[][] ARR;
    public static void main(String[] args) throws IOException{
        //첫째 줄에 N (1 ≤ N ≤ 15)이 주어진다.
        //둘째 줄부터 N개의 줄에 Ti와 Pi가 공백으로 구분되어서 주어지며, 
        //1일부터 N일까지 순서대로 주어진다. (1 ≤ Ti ≤ 5, 1 ≤ Pi ≤ 1,000)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        //일수랑 내 인덱스랑 일치시키려고 함.
        ARR = new int[N+1][2];
        StringTokenizer st;
        //시간, 금액을 가진 이차원배열 완성
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            //시간
            ARR[i][0] = Integer.parseInt(st.nextToken());
            //금액
            ARR[i][1] = Integer.parseInt(st.nextToken());
        }
        recur(1, 0);
        System.out.print(result);
    }
    private static void recur(int idx, int sum) {
        if(idx > N+1) return;
        if(idx == N+1) {
            result = Integer.max(result, sum);
            return;
        }
        //내가 오늘 상담 할 거야.
        recur(idx+ARR[idx][0], sum+ARR[idx][1]);      
        //내가 오늘 상담 안 할 거야.
        recur(idx+1, sum);
    }
}