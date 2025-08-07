class Solution {
    boolean found;
    int count = 0;
	int answer = 0;
    public int solution(String word) {
        solve(new String[]{"A", "E", "I", "O", "U"}, word, "", 0);
        return answer;
    }
    
    void solve(String[] alphabets, String findWord, String word, int depth) {
        if (found) return;
        
        if (findWord.equals(word)) {
            answer = count;
            found = true;
            return;
        }


        if (depth == 5) return;

        for (int i = 0; i < 5; i++) {
            count++;
            String nextWord = word.concat(alphabets[i]);
            solve(alphabets, findWord, nextWord, depth + 1);
        }
    }
}