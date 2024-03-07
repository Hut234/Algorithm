import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {

        // k: 최대 점수
        // m: 한 상자의 사과 수
        // score: 사과 배열
        
        Arrays.sort(score);
        
        int answer = 0;
        // 1 1 1 2 2 3 3
        // 1 1 2 2 2 2 4 4 4 4 4 4
        for(int i=score.length-m; i>-1; i-=m) {
            answer += score[i]*m;
        }
        
        // 결과: k * m * 상자 수
        return answer;
    }
}