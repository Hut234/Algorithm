import java.util.*;

class Solution {
    public int[] solution(int[][] score) {

        int len = score.length;
        int[] sums = new int[len];  
        for (int i = 0; i < len; i++) {
            int sum = score[i][0] + score[i][1];
            sums[i] = sum;
        }
        
        int[] sortedSum = Arrays.copyOf(sums, len);
        Arrays.sort(sortedSum);
        
		int[][] ranks = new int[201][2];
		ranks[0][1] = 1;
		int prev = 0;
		for (int i = len - 1, rank = 0; i > -1; i--) {
			if (prev != sortedSum[i]) {
				rank += ranks[prev][1];
			}
			ranks[sortedSum[i]][0] = rank;
			ranks[sortedSum[i]][1]++;
			prev = sortedSum[i];
		}
        
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = ranks[sums[i]][0];
        }
        
        return answer;
    }
}