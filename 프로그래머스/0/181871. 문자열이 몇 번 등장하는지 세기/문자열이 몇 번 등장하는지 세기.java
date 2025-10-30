class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
		int prev = myString.indexOf(pat);
		while (prev != -1) {
			answer++;
			prev = myString.indexOf(pat, prev + 1);
        }
		return answer;
    }
}