import java.util.*;

class Solution {

    public List<Integer> solution(int[] answers) {
        int answerCountA = 0;
        int answerCountB = 0;
        int answerCountC = 0;
        
        int[] answerA = {1, 2, 3, 4, 5};
        int lenA = answerA.length;
        int[] answerB = {2, 1, 2, 3, 2, 4, 2, 5};
        int lenB = answerB.length;
        int[] answerC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int lenC = answerC.length;
        
        int len = answers.length;
        for (int i = 0; i < len; i++) {
            int answer = answers[i];
            if (answerA[i % lenA] == answer) answerCountA++;
            if (answerB[i % lenB] == answer) answerCountB++;
            if (answerC[i % lenC] == answer) answerCountC++;
        }
        
        int max = Integer.max(Integer.max(answerCountA, answerCountB), answerCountC);
        
        List<Integer> result = new ArrayList<Integer>();
        if (max == answerCountA) result.add(1);
        if (max == answerCountB) result.add(2);
        if (max == answerCountC) result.add(3);
        
        return result;   
    }
}